package com.qphone.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qphone.pojo.AddressBean;
import com.qphone.pojo.CollectionBean;
import com.qphone.pojo.RewardBean;
import com.qphone.service.AddressService;
import com.qphone.service.CollectionService;
import com.qphone.service.RewardService;
import com.qphone.utils.Jiandate;
import com.qphone.utils.Jiansanshi;
import com.qphone.utils.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;


/**
 * Created by Administrator on 2019/5/30.
 */
@Controller
@RequestMapping("/col")
public class CollectionController{
    @Autowired
    private CollectionService collectionService;
    @Autowired
    private AddressService addressService;
    @Autowired
    private RewardService rewardService;


    @RequestMapping("/index")
    public String getindex(Model model) {
        List<CollectionBean> index = collectionService.index();
        List<CollectionBean> list = collectionService.selectbyfenlei("科技");
        List<CollectionBean> sheji = collectionService.selectbyfenlei("设计");
        List<CollectionBean> nongye = collectionService.selectbyfenlei("农业");
        List<CollectionBean> qita = collectionService.selectbyfenlei("其他");
        model.addAttribute("index", index);
        model.addAttribute("list", list);
        model.addAttribute("sheji", sheji);
        model.addAttribute("nongye", nongye);
        model.addAttribute("qita", qita);
        return "index";
    }

    @RequestMapping("/projects")
    public String getprojects(@RequestParam(value = "pages", defaultValue = "1") int pages, Model m) {
        PageHelper.startPage(pages, 6);
        List<CollectionBean> list = collectionService.selectall();
        PageInfo<CollectionBean> page = new PageInfo<>(list, 3);
        m.addAttribute("page", page);
        int count = collectionService.selectcount();
        m.addAttribute("count", count);
        return "projects";
    }

    @RequestMapping("/project")
    public String getproject(@RequestParam("id") BigDecimal id, Model m) {


        CollectionBean coll = collectionService.selectid(id);

        m.addAttribute("coll", coll);
        return "project";

    }

    @RequestMapping("/pay")
    public String getstart(@RequestParam("id") BigDecimal id, Model m, @RequestParam("pay") Double pay) {
        System.out.println(id);
        System.out.println(pay);
        CollectionBean coll = collectionService.selectid(id);
        System.out.println(coll + "++++++++++++++++++++++++++++++++++++++++++++");
        m.addAttribute("coll", coll);
        m.addAttribute("pay", pay);
        return "pay-step-1";
    }

    @RequestMapping("/pay1")
    public String getstart1( BigDecimal id, Model m, Integer shuliang, BigDecimal uuid,Double zongjia,Double pay) {
        System.out.println(pay + "+++++++++++++++++++++++++");
        System.out.println(shuliang + "+++++++++++++++++++++++++");
        System.out.println(zongjia + "+++++++++++++++++++++++++");
        CollectionBean coll = collectionService.selectid(id);
        List<AddressBean> addr = addressService.selectbyuser(uuid);
        m.addAttribute("addr", addr);
        m.addAttribute("coll", coll);
        m.addAttribute("zongjia", zongjia);
        m.addAttribute("shuliang", shuliang);
        m.addAttribute("pay", pay);
        return "pay-step-2";
    }

    @RequestMapping(value = "/huibao", method = RequestMethod.POST)
    public String gethuibao(@RequestParam("file")MultipartFile file,CollectionBean collection, Integer day, HttpServletRequest request) {
       /*得到文件的名字*/
        String filename =file.getOriginalFilename();
        String realPath=request.getRealPath("static/img1");
        /*创建文件夹*/
        File file1=new File(realPath);
        if(!file1.exists()){
            file1.mkdirs();
        }
        /*创建文件*/
        String aa=UUID.randomUUID().toString().replaceAll("-","");
        File file2=new File(file1+"/"+aa+filename);
        try {
            file2.createNewFile();
            file.transferTo(file2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(file1+"/"+aa+filename);
        collection.setPhone1("/static/img1/"+aa+filename);
        HttpSession session = request.getSession();
        session.setAttribute("collection", collection);
        session.setAttribute("day", day);
        System.out.println(day + "收集来的天数，用来计算到期日期");
        return "start-step-2";
    }

    @RequestMapping(value = "/reward", method = RequestMethod.POST)
    public String getreward(RewardBean reward, HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("reward", reward);
        System.out.println(reward + "收集来的reward集合");
        return "start-step-3";
    }

    @RequestMapping(value = "/zh", method = RequestMethod.POST)
    public String getzhanghao(HttpServletRequest request, @RequestParam("zhanghao") String zhanghao, @RequestParam("shengfen") String shengfen) {
        HttpSession session = request.getSession();
        CollectionBean collection = (CollectionBean) session.getAttribute("collection");
        RewardBean reward = (RewardBean) session.getAttribute("reward");
        Integer day = (Integer) session.getAttribute("day");
        collection.setPzhanghao(zhanghao);
        collection.setPshenfenzheng(shengfen);
        Date date = Jiansanshi.getDate(day);
       /*pday是字符串形式的加30*/
        collection.setPday(Time.getDate(date));
       /*createtime是加30之后的日期格式*/
        collection.setPcreatetime(date);
        /*算出剩余天数*/
        collection.setPshengyu(Jiandate.differentDays(new Date(), date));
       /*暂时给个1做了登录之后需要把user的值存在session中，此时直接取值即可*/
        collection.setPjieshao("很好的一家公司");
        collection.setUuid(new BigDecimal(1));
        collection.setPchou(0);
        List<String> name = collectionService.selectbyuuid(new BigDecimal(1));
        if (!name.contains(collection.getPname())) {
            int tianjiandezhi = collectionService.insertone(collection);
            BigDecimal pid = collectionService.selectidbyname(collection.getPname());
            reward.setPid(pid);
            System.out.println(reward);
            int rew = rewardService.insertone(reward);
        }
        System.out.println(collection + "collection的值");

        return "start-step-4";
    }
}
