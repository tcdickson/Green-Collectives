package com.example.greensociety;

import javafx.application.HostServices;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class LinksController extends HomeApplication implements Initializable {

    @FXML
    private ListView<String> listOfLinks;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        listOfLinks.getItems().addAll(
                "Air Force Weather Agency",
                "Aircraft and Personnel Automated Clearance System (APACS)",
                "Command Management System (DoD Networks Only)",
                "American Red Cross", "American Red Cross Message",
                "Anti-Terrorism Enterprise Portal",
                "Antivirus Home Use Program (AV HUP)",
                "Army 365 - Azure Portal",
                "Army 365 - Excel",
                "Army 365 - Home",
                "Army 365 - Information Hub",
                "Army 365 - OneDrive",
                "Army 365 - Onenote",
                "Army 365 - Planner",
                "Army 365 - PowerPoint",
                "Army 365 - Teams",
                "Army 365 - Word",
                "Army Accident Reporting System",
                "Army Acquisition Support Center",
                "Army Benefits Center",
                "Army Career Tracker",
                "Army Combat Readiness Center",
                "Army Community Service Staff System",
                "Army Credentialing Opportunities On-Line",
                "Army Criminal Investigation Command",
                "Army Disaster Personnel Accountability and Assessment System (ADPASAS)",
                "Army E-Learning",
                "Army Email",
                "Army Emergency Relief (AER)",
                "Army Enterprise Service Desk (AESD)",
                "Army Enterprise Systems Integration Program Hub (AESIP HUB)",
                "Morale, Welfare, and Recreation (MWR)",
                "Army Fit", "Army Housing Online User Services",
                "Army Human Resources Command",
                "Army Ideas for Innovation (AI2)",
                "Army Learning Management System (ALMS)",
                "Army Maintenance Application (ArMA)",
                "Army National Guard GI Personnel Gateway",
                "Army Public Health Center",
                "Army Publication Directorate (Army Pubs)",
                "Army Readiness Assessment Program",
                "Army Records Information Management System (ARIMS)",
                "Army Reserves Account Maintenance & Provisioning (ARAMP)",
                "Army Resilience Directorate", "Army Safety Management Information System (ASMIS) 2.0", "Army Senior Leadership",
                "Army SkillSoft (Skill Port)",
                "Army Substance Abuse Program (ASAP)",
                "Army Sustainment",
                "Army Training and Certification Tracking System",
                "Army Training Information System",
                "Army Training Network",
                "Army Training Requirements and Resources System (ATRRS)",
                "Army Veterinary Corps",
                "Army Virtual Soldier and Family Readiness Group (VSFRG)",
                "Assignment Satisfaction Key",
                "Benefits.gov",
                "Career Acquisition Management Portal",
                "Center for Army Leadership",
                "Central Army Registry (CAR)",
                "Citi Bank (GTCC)",
                "Combined Arms Center",
                "Comprehensive Soldier and Family Fitness",
                "Computer Hardware Enterprise Software and Solutions (CHESS)",
                "CWT Sato Travel",
                "Cyber Awareness Challenge",
                "Defense Acquisition University",
                "Defense Civilian Intelligence Personnel System (DCIPS)",
                "Defense Enrollment Eligibility Readiness (DEERS)",
                "Defense Finance and Accounting Service (DFAS)",
                "Defense Logistics Agency",
                "Defense Manpower Data Center",
                "Defense Technical Information Center",
                "Defense Threat Reduction Agency",
                "Defense Travel System",
                "Department of the Army Inspector General",
                "Department of the Army Photo Management Information System (DAPMIS)",
                "Department of the Defense Inspector General",
                "Deployed Digital Training Campus (DDTC)",
                "Deployment Health Assessment Program (DHAP)",
                "Digital Training Facility (DTF)",
                "Digital Training Management System (DTMS)",
                "DoD Automated Time Attendance and Production System",
                "DoD CAC Overview",
                "DoD CAC Reference Center",
                "DoD Cyber Exchange (NIPR)",
                "DoD Cyber Exchange (Public)",
                "DoD MWR Libraries Overdrive",
                "DoD Secure Access File Exchange (SAFE)",
                "DoD SkillBridge",
                "Dredging Operations Technical Support (DOTS)",
                "DS Login Registration",
                "EagleCash",
                "eBenefits",
                "eMILPO",
                "Enlisted & Officer Promotions",
                "Enlisted Trend Report (E5-E6)",
                "enterprise Military Housing",
                "Evaluation Entry System",
                "Federal Voting Assistance Program",
                "FEDLOG",
                "FEDLOG LITE",
                "FEDMALL",
                "Financial Disclosure Management",
                "FMS Web (DoD Computer)",
                "Force Management System (FMSWeb - DoD Computer)",
                "GI Suicide Prevention",
                "Global Electronic Approval Routing System",
                "Google Work Space - Army",
                "Green To Gold Access Portal",
                "Joint Risk Assessment Tool (JRAT)",
                "Guard Knowledge Online (GKO)",
                "Health.mil",
                "Identity, Credentialing and Access Management (ICAM) Portal",
                "IgnitED",
                "Integrated Personnel and Pay System Army (IPPS-A)",
                "iPerms",
                "iSALUTE",
                "JAG Corps",
                "JAG University",
                "Joint Knowledge Online (JKO)",
                "Joint Service Transcript (JST)",
                "LandWarNet eUniversity",
                "LHI Appointment Scheduling",
                "Medical Operational Data System",
                "MEDLine Plus",
                "MEDPROS Medical Health Assessment (MHA)",
                "MHS Genesis",
                "milConnect",
                "MILGAMING",
                "Military Child Care",
                "Military OneSource",
                "MilitaryCAC",
                "MilSuite",
                "milWIKI",
                "MOBCOP",
                "Mobile Digital Training Facility (MDTF)",
                "Move.Mil",
                "My Army Benefits",
                "My Clothing Record",
                "My Enlisted Record Brief (ERB)",
                "My Enlisted/Officer Record Brief (National Guard)",
                "My Enlisted/Officer Record Brief (Reserve)",
                "My Leave Dashboard (IPPS-A)",
                "My MEDPROS Medical Readiness Portal",
                "MY Officer Record Brief (ORB)",
                "My Physical Profile (IPPS-A)",
                "MY RFO (Request for Orders)",
                "My Soldier Talent Profile (IPPS-A)",
                "My Training Tab",
                "MyMEB",
                "MyPay",
                "NCO Leader Center for Excellence",
                "NCO Worldwide",
                "NETCOM",
                "Office of Personnel Management",
                "Officer and Warrant Officer Promotions",
                "Patient Portal Tricare Online",
                "Preventative Maintenance Monthly (P.S. Magazine)",
                "Procurement Integrated Enterprise Environment (PIEE)",
                "Promotion Point Worksheet (IPPS-A)",
                "Promotion Point Worksheet (Legacy)",
                "Psychological Health Center of Excellence",
                "Range Facility Management Support System (RFMSS)",
                "RAPIDS ID Card Office",
                "Ready Army",
                "S1 Net",
                "Service members' Group Life Insurance (SGLI)",
                "Sexual Harassment Assault Response and Prevention",
                "Soldier Enhancement Program",
                "Soldier For Life",
                "Supply and Maintenance Assistance Review Team (SMART)",
                "Survivor Outreach Services",
                "Sustainable Range Program (SRP) Portal",
                "Thrift Savings Plan",
                "TRADOC Application GateWay (TAG)",
                "Transition Assistance Program (TAP)",
                "Travel Risk Planning System (TRiPS)",
                "Trial Defense Service",
                "Tricare Dental Readiness",
                "Tricare International",
                "Tricare Online",
                "Trusted End Node Security (TENS)",
                "U.S. Armed Forces Legal Assistance",
                "U.S. Army CBRN School",
                "Unit Commander's Finance Report (UCFR)",
                "United Services Military Apprenticeship Program (USMAP)",
                "Veteran's Affairs",
                "Visual Information Ordering Site",
                "Volunteer Management Information System (VMIS)",
                "Yellow Ribbon Reintegration Program (YRRP)");

        listOfLinks.setOnMouseClicked(event -> {
            String selectedLink = listOfLinks.getSelectionModel().getSelectedItem();
            if (selectedLink != null) {
                handleLinkClick(selectedLink);
            }
        });
    }

    private void handleLinkClick(String link) {
        String url = switch (link) {
            case "Air Force Weather Agency" -> "https://weather.af.mil/";
            case "Aircraft and Personnel Automated Clearance System (APACS)" ->
                    "https://apacs.milcloud.mil/apacs/login.jsp";
            case "Command Management System (DoD Networks Only)" ->
                    "https://www.qmo.amedd.army.mil/hedis/whatiscmsarmy_june12.pdf";
            case "American Red Cross" -> "https://redcross.org/";
            case "American Red Cross Message" ->
                    "https://redcross.org/get-help/military-families/emergency-communication.html";
            case "Anti-Terrorism Enterprise Portal" -> "https://army.deps.mil/army/sites/PMG/prog/ATEP/default.aspx";
            case "Antivirus Home Use Program (AV HUP)" ->
                    "https://disa.mil/Cybersecurity/Network-Defense/Antivirus/Home-Use";
            case "Army 365 - Azure Portal" -> "https://portal.azure.us/#home";
            case "Army 365 - Excel" -> "https://www.ohome.apps.mil/launch/excel?auth=2&username=@army.mil";
            case "Army 365 - Home" -> "https://www.ohome.apps.mil/?auth=2&username=@army.mil/";
            case "Army 365 - Information Hub" -> "https://armyeitaas.sharepoint-mil.us/";
            case "Army 365 - OneDrive" -> "https://armyeitaas-my.sharepoint-mil.us/";
            case "Army 365 - Onenote" -> "https://onenote.osi.apps.mil/notebooks?auth=2&auth_upn=@army.mil";
            case "Army 365 - Planner" -> "https://tasks.osi.apps.mil/armyeitaas.onmicrosoft.us/en-US/Home/Planner/";
            case "Army 365 - PowerPoint" -> "https://www.ohome.apps.mil/launch/powerpoint?auth=2&username=@army.mil";
            case "Army 365 - Teams" -> "https://dod.teams.microsoft.us/?login_hint=@army.mil";
            case "Army 365 - Word" -> "https://www.ohome.apps.mil/launch/word?auth=2&username=@army.mil";
            case "Army Accident Reporting System" -> "https://mishap.safety.army.mil/";
            case "Army Acquisition Support Center" -> "https://asc.army.mil/web/";
            case "Army Benefits Center" -> "https://myarmybenefits.us.army.mil/";
            case "Army Career Tracker" -> "https://actnow.army.mil/";
            case "Army Combat Readiness Center" -> "https://safety.army.mil/";
            case "Army Community Service Staff System" -> "https://acsstaff.armyfamilywebportal.com/";
            case "Army Credentialing Opportunities On-Line" ->
                    "https://medcerts.com/about-army-cool?utm_campaign=Google+-+Army+COOL&utm_source=adwords&utm_medium=ppc&utm_term=&hsa_ad=452872207588&hsa_src=g&hsa_acc=3485009646&hsa_cam=6526892529&hsa_kw=&hsa_tgt=dsa-2204442333589&hsa_ver=3&hsa_net=adwords&hsa_grp=106571709038&hsa_mt=&Google+-+Army+COOL=Google+-+Army+COOL&=&google=google&tvendor=google&tdd1=google+-+army+cool&tdd2=&gad=1&gclid=Cj0KCQiAo7KqBhDhARIsAKhZ4uihAqVK4RZXM4ALg-CBlQ6YlgUDPpaNUwPQixbUySDaXmphV_0mWA4aAtJsEALw_wcB";
            case "Army Criminal Investigation Command" -> "https://www.cid.army.mil/";
            case "Army Disaster Personnel Accountability and Assessment System (ADPASAS)" ->
                    "https://adpaas.army.mil/cas/login?service=https%3A%2F%2Fadpaas.army.mil%2F";
            case "Army E-Learning" -> "https://usarmy.percipio.com/login?state=%2F#/";
            case "Army Email" -> "https://webmail.apps.mil/mail";
            case "Army Emergency Relief (AER)" -> "https://www.armyemergencyrelief.org/";
            case "Army Enterprise Service Desk (AESD)" -> "https://www.samhouston.army.mil/nec/contact.htm";
            case "Army Enterprise Systems Integration Program Hub (AESIP HUB)" -> "https://www.eis.army.mil/aesip-hub";
            case "Morale, Welfare, and Recreation (MWR)" -> "https://www.armymwr.com/";
            case "Army Fit" -> "https://armyfit.army.mil/";
            case "Army Housing Online User Services" -> "https://www.housing.army.mil/";
            case "Army Human Resources Command" -> "https://www.hrc.army.mil/";
            case "Army Ideas for Innovation (AI2)" -> "https://www.army.mil/standto/archive/2016/09/19/";
            case "Army Learning Management System (ALMS)" -> "https://www.lms.army.mil/";
            case "Army Maintenance Application (ArMA)" -> "https://www.armymaintenance.com/arma";
            case "Army National Guard GI Personnel Gateway" ->
                    "https://federation.eams.army.mil/pool/sso/authenticate/l/15?f=c&m=GET&p=9327&r=f&u=https%3A%2F%2Farngg1.ngb.army.mil%2FPortal%2FDefault.aspx&x=true";
            case "Army Public Health Center" -> "https://www.army.mil/usaphc";
            case "Army Publication Directorate (Army Pubs)" -> "https://armypubs.army.mil/";
            case "Army Readiness Assessment Program" -> "https://www.milsuite.mil/book/community/spaces/ai2";
            case "Army Records Information Management System (ARIMS)" -> "https://www.lms.army.mil/";
            case "Army Reserves Account Maintenance & Provisioning (ARAMP)" -> "https://www.armymaintenance.com/arma";
            case "Army Resilience Directorate" -> "https://www.armyresilience.army.mil/";
            case "Army Safety Management Information System (ASMIS) 2.0" -> "https://asmis.safety.army.mil/";
            case "Army Senior Leadership" -> "https://www.army.mil/leaders/sa/";
            case "Army SkillSoft (Skill Port)" -> "https://usarmy.percipio.com/login?state=%2F#/";
            case "Army Substance Abuse Program (ASAP)" -> "https://www.armyresilience.army.mil/ASAP/index.html";
            case "Army Sustainment" -> "https://www.armymaintenance.com/arma";
            case "Army Training and Certification Tracking System" ->
                    "https://federation.eams.army.mil/pool/sso/authenticate/l/15?f=c&m=GET&p=10978&r=f&u=https%3A%2F%2Fatcts.army.mil%2Fiastar%2F&x=true";
            case "Army Training Network" -> "https://atn.army.mil/";
            case "Army Training Information System" -> "https://www.pdmatis.army.mil/";
            case "Army Training Requirements and Resources System (ATRRS)" -> "https://www.atrrs.army.mil";
            case "Army Veterinary Corps" -> "https://medcoe.army.mil/amedd-veterinary-corps";
            case "Army Virtual Soldier and Family Readiness Group (VSFRG)" -> "https://vsfrg.armyfamilywebportal.com/";
            case "Assignment Satisfaction Key" -> "https://www.ask.army.mil/ASK/";
            case "Benefits.gov" -> "https://www.benefits.gov/";
            case "Career Acquisition Management Portal" -> "https://asc.army.mil/web/topics/camp/";
            case "Center for Army Leadership" -> "https://cal.army.mil/";
            case "Central Army Registry (CAR)" -> "https://rdl.train.army.mil/catalog/dashboard";
            case "Citi Bank (GTCC)" -> "https://home.cards.citidirect.com/CommercialCard/Cards.html";
            case "Combined Arms Center" -> "https://usacac.army.mil/";
            case "Comprehensive Soldier and Family Fitness" -> "https://www.usar.army.mil/CSF/";
            case "Computer Hardware Enterprise Software and Solutions (CHESS)" -> "https://chess.army.mil/";
            case "CWT Sato Travel" -> "https://www.defensetravel.dod.mil/site/rssDetail.cfm?id=84";
            case "Cyber Awareness Challenge" -> "https://cs.signal.army.mil/Default.aspx";
            case "Defense Acquisition University" -> "https://www.dau.edu/";
            case "Defense Civilian Intelligence Personnel System (DCIPS)" -> "https://dcips.defense.gov/";
            case "Defense Enrollment Eligibility Readiness (DEERS)" ->
                    "https://milconnect.dmdc.osd.mil/milconnect/public/faq/DEERS-Updating_and_Correcting_DEERS_Data";
            case "Defense Finance and Accounting Service (DFAS)" -> "https://www.dfas.mil/";
            case "Defense Logistics Agency" -> "https://www.dla.mil/";
            case "Defense Manpower Data Center" -> "https://www.dmdc.osd.mil/";
            case "Defense Technical Information Center" -> "https://discover.dtic.mil/";
            case "Defense Threat Reduction Agency" -> "https://www.dtra.mil/";
            case "Defense Travel System" -> "https://www.defensetravel.osd.mil/";
            case "Department of the Army Inspector General" -> "https://ig.army.mil/";
            case "Department of the Army Photo Management Information System (DAPMIS)" ->
                    "https://www.hrc.army.mil/content/DA%20Photo%20-%20DAPMIS%20instructions%20for%20Soldiers";
            case "Department of the Defense Inspector General" -> "https://www.dodig.mil/";
            case "Deployed Digital Training Campus (DDTC)" -> "https://ddtc.milcloud.mil/";
            case "Deployment Health Assessment Program (DHAP)" ->
                    "https://www.armyresilience.army.mil/ard/R2/Deployment-Health-Assessment-Program.html";
            case "Digital Training Facility (DTF)" -> "https://www.pdmatis.army.mil/DTF.html";
            case "Digital Training Management System (DTMS)" -> "https://dtms.army.mil/";
            case "DoD Automated Time Attendance and Production System" -> "https://ataaps.csd.disa.mil/";
            case "DoD CAC Overview" -> "https://www.cac.mil/";
            case "DoD CAC Reference Center" -> "https://www.cac.mil/";
            case "DoD Cyber Exchange (NIPR)" -> "https://public.cyber.mil/";
            case "DoD Cyber Exchange (Public)" -> "https://public.cyber.mil/";
            case "DoD MWR Libraries Overdrive" -> "https://dod.overdrive.com/";
            case "DoD Secure Access File Exchange (SAFE)" -> "https://safe.apps.mil/";
            case "DoD SkillBridge" -> "https://skillbridge.osd.mil/";
            case "Dredging Operations Technical Support (DOTS)" -> "https://dots.el.erdc.dren.mil/";
            case "DS Login Registration" -> "https://myaccess.dmdc.osd.mil/identitymanagement/app/registration";
            case "EagleCash" -> "https://fiscal.treasury.gov/eaglecash/";
            case "eBenefits" -> "https://www.ebenefits.va.gov/ebenefits/homepage";
            case "eMILPO" -> "https://www.hrc.army.mil/content/Tools%20and%20Applications%20Directory";
            case "Enlisted & Officer Promotions" ->
                    "https://www.hrc.army.mil/content/Promotions,%20Evaluations,%20and%20Awards";
            case "Enlisted Trend Report (E5-E6)" ->
                    "https://www.hrc.army.mil/EPMD/Sergeant%20and%20Staff%20Sergeant%20Eligibles%20Trend%20Report";
            case "enterprise Military Housing" -> "https://www.housing.army.mil/";
            case "Evaluation Entry System" -> "https://www.hrc.army.mil/content/Evaluation%20Systems%20Homepage";
            case "Federal Voting Assistance Program" -> "https://www.fvap.gov/";
            case "FEDLOG" -> "https://www.dla.mil/Information-Operations/Services/Applications/FED-LOG/";
            case "FEDLOG LITE" -> "https://www.lqlite.com/";
            case "FEDMALL" -> "https://www.dla.mil/Working-With-DLA/Applications/Details/Article/2877007/fedmall/";
            case "Financial Disclosure Management" -> "https://www.fdm.army.mil/";
            case "FMS Web (DoD Computer)" -> "https://fmsweb.army.mil/";
            case "Force Management System (FMSWeb - DoD Computer)" -> "https://fmsweb.army.mil/";
            case "GI Suicide Prevention" -> "https://www.armyresilience.army.mil/suicide-prevention/index.html";
            case "Global Electronic Approval Routing System" ->
                    "https://dema.az.gov/sites/default/files/2023-09/GEARS_HRO_SUPVR_CRS.pdf";
            case "Google Work Space - Army" -> "https://workspace.google.com/";
            case "Green To Gold Access Portal" ->
                    "https://www.goarmy.com/careers-and-jobs/find-your-path/army-officers/green-to-gold.html";
            case "Guard Knowledge Online (GKO)" -> "https://gko.portal.ng.mil/";
            case "Health.mil" -> "https://www.health.mil/";
            case "Identity, Credentialing and Access Management (ICAM) Portal" -> "https://icamportal.us.army.mil/";
            case "IgnitED" -> "https://www.armyignited.army.mil/student/";
            case "Integrated Personnel and Pay System Army (IPPS-A)" -> "https://ipps-a.army.mil/";
            case "iPerms" -> "https://iperms.hrc.army.mil/";
            case "iSALUTE" -> "https://www.inscom.army.mil/isalute/";
            case "JAG Corps" -> "https://www.jagcnet.army.mil/";
            case "JAG University" -> "https://jagu.army.mil/";
            case "Joint Knowledge Online (JKO)" -> "https://jkodirect.jten.mil/";
            case "Joint Risk Assessment Tool (JRAT)" -> "https://jrat.safety.army.mil/login.aspx";
            case "Joint Service Transcript (JST)" -> "https://jst.doded.mil/jst/";
            case "LandWarNet eUniversity" ->
                    "https://federation.eams.army.mil/pool/sso/authenticate/l/15?f=c&m=GET&p=9725&r=f&u=https%3A%2F%2Flwn.army.mil%2F&x=true";
            case "LHI Appointment Scheduling" -> "https://lhi.care/start";
            case "Medical Operational Data System" -> "https://www.mods.army.mil/";
            case "MEDLine Plus" -> "https://medlineplus.gov/";
            case "MEDPROS Medical Health Assessment (MHA)" -> "https://www.mods.army.mil/MODSHome";
            case "MHS Genesis" -> "https://myaccess.dmdc.osd.mil/identitymanagement/app/login";
            case "milConnect" -> "https://milconnect.dmdc.osd.mil/milconnect/";
            case "MILGAMING" -> "https://milgaming.army.mil/";
            case "Military Child Care" -> "https://militarychildcare.com/";
            case "Military OneSource" -> "https://www.militaryonesource.mil/";
            case "MilitaryCAC" -> "https://militarycac.com/";
            case "MilSuite" -> "https://www.milsuite.mil/";
            case "milWIKI" -> "https://www.milsuite.mil/book/community/spaces/milwiki";
            case "MOBCOP" -> "https://mobcop.aoc.army.pentagon.mil/";
            case "Mobile Digital Training Facility (MDTF)" -> "https://www.pdmatis.army.mil/MDTF.html";
            case "Move.Mil" -> "https://my.move.mil/sign-in";
            case "My Army Benefits" -> "https://myarmybenefits.us.army.mil/";
            case "My Clothing Record" -> "https://www.hrcapps.army.mil/Portal/";
            case "My Enlisted Record Brief (ERB)" ->
                    "https://www.hrc.army.mil/content/Army%20Soldier%20Records%20Branch%20-%20ASRB";
            case "My Enlisted/Officer Record Brief (National Guard)" ->
                    "https://www.hrc.army.mil/content/Army%20Soldier%20Records%20Branch%20-%20ASRB";
            case "My Enlisted/Officer Record Brief (Reserve)" ->
                    "https://www.hrc.army.mil/content/Army%20Soldier%20Records%20Branch%20-%20ASRB";
            case "My Leave Dashboard (IPPS-A)" -> "https://ipps-a.army.mil/";
            case "My MEDPROS Medical Readiness Portal" -> "https://medpros.mods.army.mil/MEDPROSNew/";
            case "MY Officer Record Brief (ORB)" ->
                    "https://www.hrc.army.mil/content/Army%20Soldier%20Records%20Branch%20-%20ASRB";
            case "My Physical Profile (IPPS-A)" -> "https://myaccess.dmdc.osd.mil/identitymanagement/app/login";
            case "MY RFO (Request for Orders)" -> "https://www.hrcapps.army.mil/Portal/";
            case "My Soldier Talent Profile (IPPS-A)" -> "https://ipps-a.army.mil/About/Talent-Management/";
            case "My Training Tab" -> "https://www.hrcapps.army.mil/Portal/";
            case "MyMEB" ->
                    "https://william-beaumont.tricare.mil/Health-Services/Other/Integrated-Disability-Evaluation-System";
            case "MyPay" -> "https://mypay.dfas.mil/mypay.aspx/";
            case "NCO Leader Center for Excellence" -> "https://www.ncolcoe.army.mil/About-Us/About-The-NCOLCoE/";
            case "NCO Worldwide" -> "https://www.armyupress.army.mil/Journals/NCO-Journal/";
            case "NETCOM" -> "https://www.army.mil/netcom";
            case "Office of Personnel Management" -> "https://www.opm.gov/";
            case "Officer and Warrant Officer Promotions" ->
                    "https://www.hrc.army.mil/content/Promotions,%20Evaluations,%20and%20Awards";
            case "Patient Portal Tricare Online" -> "https://www.tricareonline.com/";
            case "Preventative Maintenance Monthly (P.S. Magazine)" -> "https://www.psmagazine.army.mil/";
            case "Procurement Integrated Enterprise Environment (PIEE)" -> "https://wawf.eb.mil/";
            case "Promotion Point Worksheet (IPPS-A)" -> "https://www.hrcapps.army.mil/Portal/";
            case "Promotion Point Worksheet (Legacy)" -> "https://www.hrcapps.army.mil/Portal/";
            case "Psychological Health Center of Excellence" ->
                    "https://health.mil/Military-Health-Topics/Centers-of-Excellence/Psychological-Health-Center-of-Excellence";
            case "Range Facility Management Support System (RFMSS)" -> "https://www.pdmatis.army.mil/RFMSS.html";
            case "RAPIDS ID Card Office" -> "https://idco.dmdc.osd.mil/idco/";
            case "Ready Army" -> "https://ready.army.mil/";
            case "S1 Net" -> "https://www.milsuite.mil/book/community/spaces/s1net";
            case "Service members' Group Life Insurance (SGLI)" -> "https://milconnect.dmdc.osd.mil/milconnect/";
            case "Sexual Harassment Assault Response and Prevention" -> "https://www.armyresilience.army.mil/sharp/";
            case "Soldier Enhancement Program" -> "https://www.peosoldier.army.mil/sep/";
            case "Soldier For Life" -> "https://soldierforlife.army.mil/";
            case "Supply and Maintenance Assistance Review Team (SMART)" ->
                    "https://cascom.army.mil/g_staff/cdi/smart1.htm";
            case "Survivor Outreach Services" ->
                    "https://www.armyfamilywebportal.com/content/survivor-outreach-services-sos";
            case "Sustainable Range Program (SRP) Portal" -> "https://srp.army.mil/";
            case "Thrift Savings Plan" -> "https://www.tsp.gov/";
            case "TRADOC Application GateWay (TAG)" -> "https://rdl.train.army.mil/tag/#/";
            case "Transition Assistance Program (TAP)" -> "https://www.dodtap.mil/";
            case "Travel Risk Planning System (TRiPS)" -> "https://trips.safety.army.mil/";
            case "Trial Defense Service" -> "https://www.jagcnet.army.mil/legal";
            case "Tricare Dental Readiness" -> "https://www.addp-ucci.com/";
            case "Tricare International" -> "https://www.tricare-overseas.com/";
            case "Tricare Online" -> "https://www.tricareonline.com/";
            case "Trusted End Node Security (TENS)" -> "https://distrowatch.com/table.php?distribution=tens";
            case "U.S. Armed Forces Legal Assistance" -> "https://legalassistance.law.af.mil/";
            case "U.S. Army CBRN School" -> "https://home.army.mil/wood/units-tenants/USACBRNS";
            case "Unit Commander's Finance Report (UCFR)" ->
                    "https://www.mynavyhr.navy.mil/Portals/55/Support/PayPers/CPCResources/eUCFR_User-Guide%20v6.pdf?ver=DK1ozNs5rsVrjGT3KYmsNw%3D%3D";
            case "United Services Military Apprenticeship Program (USMAP)" -> "https://usmap.osd.mil/";
            case "Veteran's Affairs" -> "https://www.va.gov/";
            case "Visual Information Ordering Site" -> "https://vios.army.mil/";
            case "Volunteer Management Information System (VMIS)" -> "https://vmis.armyfamilywebportal.com/";
            case "Yellow Ribbon Reintegration Program (YRRP)" -> "https://www.yellowribbon.mil/";
            default -> null;
        };

        if (url != null) {
            openWebPage(url);
        }
    }

    private void openWebPage(String url) {
        HostServices hostServices = getHostServices();
        hostServices.showDocument(url);
    }
}

