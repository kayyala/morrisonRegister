$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("rigester.feature");
formatter.feature({
  "id": "online-shopping",
  "description": "\r\nIn order to do the Online shopping\r\nAs a customer\r\nI want to do online shopping\r\nso that i can register",
  "name": "Online shopping",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "online-shopping;registering-online",
  "tags": [
    {
      "name": "@Register",
      "line": 9
    }
  ],
  "description": "",
  "name": "registering online",
  "keyword": "Scenario",
  "line": 10,
  "type": "scenario"
});
formatter.step({
  "name": "I am navigating to the morrison websits",
  "keyword": "Given ",
  "line": 11
});
formatter.step({
  "name": "i click on rigester",
  "keyword": "And ",
  "line": 12
});
formatter.step({
  "name": "I enter details of newuser",
  "keyword": "When ",
  "line": 13
});
formatter.step({
  "name": "I tick on terms\u0026conditions",
  "keyword": "And ",
  "line": 14
});
formatter.step({
  "name": "I click on register",
  "keyword": "Then ",
  "line": 15
});
formatter.step({
  "name": "I find ful address,select house no,",
  "keyword": "And ",
  "line": 16
});
formatter.step({
  "name": "I select my date of birth and gender",
  "keyword": "And ",
  "line": 17
});
formatter.step({
  "name": "I enter mobile number and no people",
  "keyword": "And ",
  "line": 18
});
formatter.step({
  "name": "I click on continue",
  "keyword": "And ",
  "line": 19
});
formatter.match({
  "location": "MyRegisterStepdefs.iAmNavigatingToTheMorrisonWebsits()"
});
formatter.result({
  "duration": 31325408881,
  "status": "passed"
});
formatter.match({
  "location": "MyRegisterStepdefs.iClickOnRigester()"
});
formatter.result({
  "duration": 4820745345,
  "status": "passed"
});
formatter.match({
  "location": "MyRegisterStepdefs.iEnterDetailsOfNewuser()"
});
formatter.result({
  "duration": 1684426555,
  "status": "passed"
});
formatter.match({
  "location": "MyRegisterStepdefs.iTickOnTermsConditions()"
});
formatter.result({
  "duration": 207105871,
  "status": "passed"
});
formatter.match({
  "location": "MyRegisterStepdefs.iClickOnRegister()"
});
formatter.result({
  "duration": 298206975,
  "status": "passed"
});
formatter.match({
  "location": "MyRegisterStepdefs.iFindFulAddressSelectHouseNo()"
});
formatter.result({
  "duration": 9928889290,
  "status": "passed"
});
formatter.match({
  "location": "MyRegisterStepdefs.iSelectMyDateOfBirthAndGender()"
});
formatter.result({
  "duration": 1278194002,
  "status": "passed"
});
formatter.match({
  "location": "MyRegisterStepdefs.iEnterMobileNumberAndNoPeople()"
});
formatter.result({
  "duration": 1127684133,
  "status": "passed"
});
formatter.match({
  "location": "MyRegisterStepdefs.iClickOnContinue()"
});
formatter.result({
  "duration": 3350916697,
  "status": "passed"
});
});