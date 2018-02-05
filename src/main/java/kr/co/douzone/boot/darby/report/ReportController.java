package kr.co.douzone.boot.darby.report;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@EnableWebMvc
public class ReportController {

	@RequestMapping(path = "/report/breeding_pig_supply_statement", method = RequestMethod.GET)
	public View breedingPigSupplyStatement(Model model, RedirectAttributes redirect) {
		ModelAndView mav = new ModelAndView("/report/breeding_pig_supply_statement");
		return mav.getView();
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
	
}
