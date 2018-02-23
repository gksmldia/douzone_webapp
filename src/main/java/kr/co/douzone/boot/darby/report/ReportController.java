package kr.co.douzone.boot.darby.report;

import org.json.simple.JSONObject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.douzone.boot.darby.shipping.ShppingManagementController;

@RestController
@EnableWebMvc
public class ReportController {

	ShppingManagementController shipping = new ShppingManagementController();
	
	@RequestMapping(path = "/report/breeding_pig_supply_statement", method = RequestMethod.GET)
	public ModelAndView breedingPigSupplyStatement(Model model, RedirectAttributes redirect
			,@RequestParam(value = "CD_PARTNER", required = false, defaultValue = "") String CD_PARTNER
			,@RequestParam(value = "DT_SHIP", required = false, defaultValue = "") String DT_SHIP) {
		
		ModelAndView mav = new ModelAndView("/report/breeding_pig_supply_statement");
		mav.addObject("CD_PARTNER", CD_PARTNER);
		mav.addObject("DT_SHIP", DT_SHIP);
//		model.addAttribute("paramData", json_return.toString());
		return mav;
	}
	
	@RequestMapping(path = "/report/flat_rate_account", method = RequestMethod.GET)
	public View flatRateAccount(Model model, RedirectAttributes redirect) {
		ModelAndView mav = new ModelAndView("/report/flat_rate_account");
		return mav.getView();
	}
	
	@RequestMapping(path = "/report/performance_to_plan", method = RequestMethod.GET)
	public View performanceToPlan(Model model, RedirectAttributes redirect) {
		ModelAndView mav = new ModelAndView("/report/performance_to_plan");
		return mav.getView();
	}
	
	@RequestMapping(path = "/report/perfomance_chart_view", method = RequestMethod.GET)
	public ModelAndView perfomanceChartView(Model model, RedirectAttributes redirect
			,@RequestParam(value = "paramData", required = false, defaultValue = "") String paramData) {
		JSONObject json_return = new JSONObject();
		json_return = shipping.jsonPasing(paramData);
		
		ModelAndView mav = new ModelAndView("/report/perfomance_chart_view");
		mav.addObject("paramData", json_return.toString());
//		model.addAttribute("paramData", json_return.toString());
		return mav;
	}
	
}
