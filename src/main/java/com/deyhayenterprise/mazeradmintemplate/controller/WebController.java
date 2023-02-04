package com.deyhayenterprise.mazeradmintemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class WebController {

    @RequestMapping(value = { "/", "/index", "/index.html" })
	public String indexMain(Model model) {

		log.info("web controller class paramaters as model");

        return "index";
    }    	

	@RequestMapping(value = { "/application-chat", "/application-chat.html" })
	public String applicationChat() {
		return "application-chat";
	}

	@RequestMapping(value = { "/application-checkout", "/application-checkout.html" })
	public String applicationCheckout() {
		return "application-checkout";
	}

	@RequestMapping(value = { "/application-email", "/application-email.html" })
	public String applicationEmail() {
		return "application-email";
	}

	@RequestMapping(value = { "/application-gallery", "/application-gallery.html" })
	public String applicationGallery() {
		return "application-gallery";
	}

	@RequestMapping(value = { "/error-403", "/error-403.html" })
	public String error403() {
		return "error-403";
	}	

	@RequestMapping(value = { "/error-404", "/error-404.html" })
	public String error404() {
		return "error-404";
	}

	@RequestMapping(value = { "/error-500", "/error-500.html" })
	public String error500() {
		return "error-500";
	}

	@RequestMapping(value = { "/auth-login", "/auth-login.html" })
	public String authLogin() {
		return "auth-login";
	}

	@RequestMapping(value = { "/auth-register", "/auth-register.html" })
	public String authRegister() {
		return "auth-register";
	}

	@RequestMapping(value = { "/auth-forgot-password", "/auth-forgot-password.html" })
	public String authForgotPassword() {
		return "auth-forgot-password";
	}

	@RequestMapping(value = { "/component-alert", "/component-alert.html" })
	public String componentAlert() {
		return "component-alert";
	}

	@RequestMapping(value = { "/component-badge", "/component-badge.html" })
	public String componentBadge() {
		return "component-badge";
	}

	@RequestMapping(value = { "/component-breadcrumb", "/component-breadcrumb.html" })
	public String componentBreadcrumb() {
		return "component-breadcrumb";
	}

	@RequestMapping(value = { "/component-button", "/component-button.html" })
	public String componentButton() {
		return "component-button";
	}

	@RequestMapping(value = { "/component-card", "/component-card.html" })
	public String componentCard() {
		return "component-card";
	}

	@RequestMapping(value = { "/component-carousel", "/component-carousel.html" })
	public String componentCarousel() {
		return "component-carousel";
	}

	@RequestMapping(value = { "/component-dropdown", "/component-dropdown.html" })
	public String componentDropdown() {
		return "component-dropdown";
	}

	@RequestMapping(value = { "/component-list-group", "/component-list-group.html" })
	public String componentListGroup() {
		return "component-list-group";
	}

	@RequestMapping(value = { "/component-modal", "/component-modal.html" })
	public String componentModal() {
		return "component-modal";
	}

	@RequestMapping(value = { "/component-navs", "/component-navs.html" })
	public String componentNavs() {
		return "component-navs";
	}

	@RequestMapping(value = { "/component-pagination", "/component-pagination.html" })
	public String componentPagination() {
		return "component-pagination";
	}

	@RequestMapping(value = { "/component-progress", "/component-progress.html" })
	public String componentProgress() {
		return "component-progress";
	}

	@RequestMapping(value = { "/component-spinner", "/component-spinner.html" })
	public String componentSpinner() {
		return "component-spinner";
	}

	@RequestMapping(value = { "/component-tooltip", "/component-tooltip.html" })
	public String componentTooltip() {
		return "component-tooltip";
	}

	@RequestMapping(value = { "/extra-component-avatar", "/extra-component-avatar.html" })
	public String extraComponentAvatar() {
		return "extra-component-avatar";
	}

	@RequestMapping(value = { "/extra-component-divider", "/extra-component-divider.html" })
	public String extraComponentDivider() {
		return "extra-component-divider";
	}

	@RequestMapping(value = { "/extra-component-rating", "/extra-component-rating.html" })
	public String extraComponentRating() {
		return "extra-component-rating";
	}

	@RequestMapping(value = { "/extra-component-sweetalert", "/extra-component-sweetalert.html" })
	public String extraComponentSweetalert() {
		return "extra-component-sweetalert";
	}

	@RequestMapping(value = { "/extra-component-toastify", "/extra-component-toastify.html" })
	public String extraComponentToastify() {
		return "extra-component-toastify";
	}

	@RequestMapping(value = { "/layout-default", "/layout-default.html" })
	public String layoutDefault() {
		return "layout-default";
	}

	@RequestMapping(value = { "/layout-horizontal", "/layout-horizontal.html" })
	public String layoutHorizontal() {
		return "layout-horizontal";
	}

	@RequestMapping(value = { "/layout-vertical-1-column", "/layout-vertical-1-column.html" })
	public String layoutVertical1Column() {
		return "layout-vertical-1-column";
	}

	@RequestMapping(value = { "/layout-vertical-navbar", "/layout-vertical-navbar.html" })
	public String layoutVerticalNavbar() {
		return "layout-vertical-navbar";
	}

	@RequestMapping(value = { "/form-editor-ckeditor", "/form-editor-ckeditor.html" })
	public String formEditorCkeditor() {
		return "form-editor-ckeditor";
	}

	@RequestMapping(value = { "/form-editor-quill", "/form-editor-quill.html" })
	public String formEditorQuill() {
		return "form-editor-quill";
	}

	@RequestMapping(value = { "/form-editor-summernote", "/form-editor-summernote.html" })
	public String formEditorSummernote() {
		return "form-editor-summernote";
	}

	@RequestMapping(value = { "/form-editor-tinymce", "/form-editor-tinymce.html" })
	public String formEditorTinymce() {
		return "form-editor-tinymce";
	}

	@RequestMapping(value = { "/form-element-checkbox", "/form-element-checkbox.html" })
	public String formElementCheckbox() {
		return "form-element-checkbox";
	}

	@RequestMapping(value = { "/form-element-input-group", "/form-element-input-group.html" })
	public String formElementInputGroup() {
		return "form-element-input-group";
	}

	@RequestMapping(value = { "/form-element-input", "/form-element-input.html" })
	public String formElementInput() {
		return "form-element-input";
	}

	@RequestMapping(value = { "/form-element-radio", "/form-element-radio.html" })
	public String formElementRadio() {
		return "form-element-radio";
	}

	@RequestMapping(value = { "/form-element-select", "/form-element-select.html" })
	public String formElementSelect() {
		return "form-element-select";
	}

	@RequestMapping(value = { "/form-element-textarea", "/form-element-textarea.html" })
	public String formElementTextarea() {
		return "form-element-textarea";
	}

	@RequestMapping(value = { "/form-layout", "/form-layout.html" })
	public String formLayout() {
		return "form-layout";
	}

	@RequestMapping(value = { "/table", "/table.html" })
	public String table() {
		return "table";
	}

	@RequestMapping(value = { "/table-datatable", "/table-datatable.html" })
	public String tableDatatable() {
		return "table-datatable";
	}

	@RequestMapping(value = { "/ui-chart-apexcharts", "/ui-chart-apexcharts.html" })
	public String uiChartApexcharts() {
		return "ui-chart-apexcharts";
	}

	@RequestMapping(value = { "/ui-chart-chartjs", "/ui-chart-chartjs.html" })
	public String uiChartChartjs() {
		return "ui-chart-chartjs";
	}

	@RequestMapping(value = { "/ui-file-uploader", "/ui-file-uploader.html" })
	public String uiFileUploader() {
		return "ui-file-uploader";
	}

	@RequestMapping(value = { "/ui-icons-bootstrap-icons", "/ui-icons-bootstrap-icons.html" })
	public String uiIconsBootstrapIcons() {
		return "ui-icons-bootstrap-icons";
	}

	@RequestMapping(value = { "/ui-icons-dripicons", "/ui-icons-dripicons.html" })
	public String uiIconsDripicons() {
		return "ui-icons-dripicons";
	}

	@RequestMapping(value = { "/ui-icons-fontawesome", "/ui-icons-fontawesome.html" })
	public String uiIconsFontawesome() {
		return "ui-icons-fontawesome";
	}

	@RequestMapping(value = { "/ui-map-google-map", "/ui-map-google-map.html" })
	public String uiMapGoogleMap() {
		return "ui-map-google-map";
	}

	@RequestMapping(value = { "/ui-map-jsvectormap", "/ui-map-jsvectormap.html" })
	public String uiMapJsvectormap() {
		return "ui-map-jsvectormap";
	}

	@RequestMapping(value = { "/ui-widgets-chatbox", "/ui-widgets-chatbox.html" })
	public String uiWidgetsChatbox() {
		return "ui-widgets-chatbox";
	}

	@RequestMapping(value = { "/ui-widgets-pricing", "/ui-widgets-pricing.html" })
	public String uiWidgetsPricing() {
		return "ui-widgets-pricing";
	}

	@RequestMapping(value = { "/ui-widgets-todolist", "/ui-widgets-todolist.html" })
	public String uiWidgetsTodolist() {
		return "ui-widgets-todolist";
	}
    
}
