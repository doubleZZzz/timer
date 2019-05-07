package cn.zz.com.timer.controller;

import cn.zz.com.timer.domain.TPromotion;
import cn.zz.com.timer.service.ITPromotionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: ZhangZhuo
 * @Date: 2019/5/7 09:56
 * @Description:
 */
@Controller
public class TPromotionController {

    @Resource
    private ITPromotionService ITPromotionService;

    /**
     * 展示所有活动(注:上级活动ID为null)
     * @param model
     * @return
     */
    @RequestMapping("listProm")
    public String personal(Model model) {
        List<TPromotion> proms = ITPromotionService.selectByUpId();

        model.addAttribute("proms", proms);
        return "listProm";
    }
}
