# Diff Details

Date : 2023-02-18 23:33:54

Directory /Users/saugatsingh/Documents/Projects/app

Total : 125 files,  1021 codes, 9 comments, 122 blanks, all 1152 lines

[Summary](results.md) / [Details](details.md) / [Diff Summary](diff.md) / Diff Details

## Files
| filename | language | code | comment | blank | total |
| :--- | :--- | ---: | ---: | ---: | ---: |
| [.mvn/wrapper/maven-wrapper.properties](/.mvn/wrapper/maven-wrapper.properties) | Java Properties | 2 | 0 | 1 | 3 |
| [mvnw.cmd](/mvnw.cmd) | Batch | 102 | 51 | 36 | 189 |
| [pom.xml](/pom.xml) | XML | 83 | 0 | 4 | 87 |
| [src/main/java/com/kjlc/app/AppApplication.java](/src/main/java/com/kjlc/app/AppApplication.java) | Java | 9 | 0 | 5 | 14 |
| [src/main/java/com/kjlc/app/Entity/Question.java](/src/main/java/com/kjlc/app/Entity/Question.java) | Java | 24 | 0 | 6 | 30 |
| [src/main/java/com/kjlc/app/Entity/Result.java](/src/main/java/com/kjlc/app/Entity/Result.java) | Java | 22 | 0 | 4 | 26 |
| [src/main/java/com/kjlc/app/Entity/Student.java](/src/main/java/com/kjlc/app/Entity/Student.java) | Java | 29 | 0 | 6 | 35 |
| [src/main/java/com/kjlc/app/Entity/Submission.java](/src/main/java/com/kjlc/app/Entity/Submission.java) | Java | 21 | 0 | 3 | 24 |
| [src/main/java/com/kjlc/app/Entity/Test.java](/src/main/java/com/kjlc/app/Entity/Test.java) | Java | 20 | 0 | 6 | 26 |
| [src/main/java/com/kjlc/app/Entity/User.java](/src/main/java/com/kjlc/app/Entity/User.java) | Java | 54 | 4 | 14 | 72 |
| [src/main/java/com/kjlc/app/SecurityContext/Context.java](/src/main/java/com/kjlc/app/SecurityContext/Context.java) | Java | 24 | 1 | 9 | 34 |
| [src/main/java/com/kjlc/app/config/PasswordEncoderUtil.java](/src/main/java/com/kjlc/app/config/PasswordEncoderUtil.java) | Java | 8 | 0 | 3 | 11 |
| [src/main/java/com/kjlc/app/controller/AdminController.java](/src/main/java/com/kjlc/app/controller/AdminController.java) | Java | 85 | 1 | 20 | 106 |
| [src/main/java/com/kjlc/app/controller/AdminDashController.java](/src/main/java/com/kjlc/app/controller/AdminDashController.java) | Java | 53 | 0 | 10 | 63 |
| [src/main/java/com/kjlc/app/controller/LoginController.java](/src/main/java/com/kjlc/app/controller/LoginController.java) | Java | 23 | 0 | 4 | 27 |
| [src/main/java/com/kjlc/app/controller/UserController.java](/src/main/java/com/kjlc/app/controller/UserController.java) | Java | 66 | 0 | 11 | 77 |
| [src/main/java/com/kjlc/app/controller/UserDashController.java](/src/main/java/com/kjlc/app/controller/UserDashController.java) | Java | 41 | 0 | 11 | 52 |
| [src/main/java/com/kjlc/app/repository/QuestionRepository.java](/src/main/java/com/kjlc/app/repository/QuestionRepository.java) | Java | 10 | 0 | 6 | 16 |
| [src/main/java/com/kjlc/app/repository/ResultRepository.java](/src/main/java/com/kjlc/app/repository/ResultRepository.java) | Java | 9 | 0 | 6 | 15 |
| [src/main/java/com/kjlc/app/repository/StudentRepository.java](/src/main/java/com/kjlc/app/repository/StudentRepository.java) | Java | 5 | 0 | 5 | 10 |
| [src/main/java/com/kjlc/app/repository/SubmissionRepository.java](/src/main/java/com/kjlc/app/repository/SubmissionRepository.java) | Java | 11 | 0 | 7 | 18 |
| [src/main/java/com/kjlc/app/repository/TestRepository.java](/src/main/java/com/kjlc/app/repository/TestRepository.java) | Java | 5 | 0 | 5 | 10 |
| [src/main/java/com/kjlc/app/repository/UserRepository.java](/src/main/java/com/kjlc/app/repository/UserRepository.java) | Java | 9 | 0 | 6 | 15 |
| [src/main/java/com/kjlc/app/security/AuthenticationSuccessHandler.java](/src/main/java/com/kjlc/app/security/AuthenticationSuccessHandler.java) | Java | 25 | 0 | 12 | 37 |
| [src/main/java/com/kjlc/app/security/SpringSecurityConfig.java](/src/main/java/com/kjlc/app/security/SpringSecurityConfig.java) | Java | 37 | 13 | 10 | 60 |
| [src/main/java/com/kjlc/app/services/QuestionService.java](/src/main/java/com/kjlc/app/services/QuestionService.java) | Java | 9 | 0 | 4 | 13 |
| [src/main/java/com/kjlc/app/services/ResultService.java](/src/main/java/com/kjlc/app/services/ResultService.java) | Java | 7 | 0 | 4 | 11 |
| [src/main/java/com/kjlc/app/services/StudentService.java](/src/main/java/com/kjlc/app/services/StudentService.java) | Java | 8 | 0 | 4 | 12 |
| [src/main/java/com/kjlc/app/services/SubmissionService.java](/src/main/java/com/kjlc/app/services/SubmissionService.java) | Java | 8 | 0 | 4 | 12 |
| [src/main/java/com/kjlc/app/services/TestService.java](/src/main/java/com/kjlc/app/services/TestService.java) | Java | 11 | 0 | 5 | 16 |
| [src/main/java/com/kjlc/app/services/UserService.java](/src/main/java/com/kjlc/app/services/UserService.java) | Java | 5 | 0 | 3 | 8 |
| [src/main/java/com/kjlc/app/services/impl/CustomUserDetailService.java](/src/main/java/com/kjlc/app/services/impl/CustomUserDetailService.java) | Java | 16 | 0 | 7 | 23 |
| [src/main/java/com/kjlc/app/services/impl/QuestionServiceImpl.java](/src/main/java/com/kjlc/app/services/impl/QuestionServiceImpl.java) | Java | 37 | 0 | 14 | 51 |
| [src/main/java/com/kjlc/app/services/impl/ResultServiceImpl.java](/src/main/java/com/kjlc/app/services/impl/ResultServiceImpl.java) | Java | 20 | 0 | 9 | 29 |
| [src/main/java/com/kjlc/app/services/impl/StudentServiceImpl.java](/src/main/java/com/kjlc/app/services/impl/StudentServiceImpl.java) | Java | 24 | 0 | 9 | 33 |
| [src/main/java/com/kjlc/app/services/impl/SubmissionServiceImpl.java](/src/main/java/com/kjlc/app/services/impl/SubmissionServiceImpl.java) | Java | 28 | 0 | 11 | 39 |
| [src/main/java/com/kjlc/app/services/impl/TestServiceImpl.java](/src/main/java/com/kjlc/app/services/impl/TestServiceImpl.java) | Java | 35 | 0 | 12 | 47 |
| [src/main/java/com/kjlc/app/services/impl/UserServiceImpl.java](/src/main/java/com/kjlc/app/services/impl/UserServiceImpl.java) | Java | 27 | 0 | 7 | 34 |
| [src/main/java/com/kjlc/app/utils/Builder.java](/src/main/java/com/kjlc/app/utils/Builder.java) | Java | 69 | 0 | 14 | 83 |
| [src/main/java/com/kjlc/app/utils/ResultUtils.java](/src/main/java/com/kjlc/app/utils/ResultUtils.java) | Java | 29 | 1 | 9 | 39 |
| [src/main/resources/application.properties](/src/main/resources/application.properties) | Java Properties | 5 | 0 | 1 | 6 |
| [src/main/resources/static/assets/brand/bootstrap-logo-white.svg](/src/main/resources/static/assets/brand/bootstrap-logo-white.svg) | XML | 1 | 0 | 0 | 1 |
| [src/main/resources/static/assets/brand/bootstrap-logo.svg](/src/main/resources/static/assets/brand/bootstrap-logo.svg) | XML | 1 | 0 | 1 | 2 |
| [src/main/resources/static/assets/dist/css/bootstrap.min.css](/src/main/resources/static/assets/dist/css/bootstrap.min.css) | CSS | 2 | 4 | 0 | 6 |
| [src/main/resources/static/assets/dist/css/bootstrap.rtl.min.css](/src/main/resources/static/assets/dist/css/bootstrap.rtl.min.css) | CSS | 2 | 4 | 0 | 6 |
| [src/main/resources/static/assets/dist/js/bootstrap.bundle.min.js](/src/main/resources/static/assets/dist/js/bootstrap.bundle.min.js) | JavaScript | 1 | 6 | 0 | 7 |
| [src/main/resources/static/css/CreateTest.css](/src/main/resources/static/css/CreateTest.css) | CSS | 7 | 0 | 1 | 8 |
| [src/main/resources/static/css/dashboard.css](/src/main/resources/static/css/dashboard.css) | CSS | 140 | 14 | 15 | 169 |
| [src/main/resources/static/css/dashboard.rtl.css](/src/main/resources/static/css/dashboard.rtl.css) | CSS | 66 | 6 | 17 | 89 |
| [src/main/resources/static/css/login.css](/src/main/resources/static/css/login.css) | CSS | 69 | 0 | 14 | 83 |
| [src/main/resources/static/css/login_.css](/src/main/resources/static/css/login_.css) | CSS | 155 | 0 | 8 | 163 |
| [src/main/resources/static/css/register.css](/src/main/resources/static/css/register.css) | CSS | 154 | 0 | 7 | 161 |
| [src/main/resources/static/js/dashboard.js](/src/main/resources/static/js/dashboard.js) | JavaScript | 47 | 3 | 4 | 54 |
| [src/main/resources/static/js/login.js](/src/main/resources/static/js/login.js) | JavaScript | 59 | 0 | 12 | 71 |
| [src/main/resources/templates/ViewSubmission.html](/src/main/resources/templates/ViewSubmission.html) | HTML | 7 | 0 | 0 | 7 |
| [src/main/resources/templates/createTest.html](/src/main/resources/templates/createTest.html) | HTML | 261 | 1 | 25 | 287 |
| [src/main/resources/templates/editTest.html](/src/main/resources/templates/editTest.html) | HTML | 269 | 1 | 22 | 292 |
| [src/main/resources/templates/forgot.html](/src/main/resources/templates/forgot.html) | HTML | 51 | 0 | 2 | 53 |
| [src/main/resources/templates/home.html](/src/main/resources/templates/home.html) | HTML | 251 | 16 | 19 | 286 |
| [src/main/resources/templates/listStudents.html](/src/main/resources/templates/listStudents.html) | HTML | 220 | 1 | 20 | 241 |
| [src/main/resources/templates/login.html](/src/main/resources/templates/login.html) | HTML | 71 | 0 | 6 | 77 |
| [src/main/resources/templates/register.html](/src/main/resources/templates/register.html) | HTML | 119 | 3 | 12 | 134 |
| [src/main/resources/templates/reset.html](/src/main/resources/templates/reset.html) | HTML | 52 | 0 | 2 | 54 |
| [src/main/resources/templates/test.html](/src/main/resources/templates/test.html) | HTML | 109 | 0 | 16 | 125 |
| [src/main/resources/templates/testView.html](/src/main/resources/templates/testView.html) | HTML | 238 | 1 | 19 | 258 |
| [src/test/java/com/kjlc/app/AppApplicationTests.java](/src/test/java/com/kjlc/app/AppApplicationTests.java) | Java | 9 | 0 | 5 | 14 |
| [/Users/saugatsingh/app/.mvn/wrapper/maven-wrapper.properties](//Users/saugatsingh/app/.mvn/wrapper/maven-wrapper.properties) | Java Properties | -2 | 0 | -1 | -3 |
| [/Users/saugatsingh/app/mvnw.cmd](//Users/saugatsingh/app/mvnw.cmd) | Batch | -102 | -51 | -36 | -189 |
| [/Users/saugatsingh/app/pom.xml](//Users/saugatsingh/app/pom.xml) | XML | -83 | 0 | -4 | -87 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/AppApplication.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/AppApplication.java) | Java | -9 | 0 | -5 | -14 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/Entity/Question.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/Entity/Question.java) | Java | -24 | 0 | -6 | -30 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/Entity/Student.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/Entity/Student.java) | Java | -24 | 0 | -6 | -30 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/Entity/Submission.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/Entity/Submission.java) | Java | -22 | 0 | -4 | -26 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/Entity/Test.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/Entity/Test.java) | Java | -18 | 0 | -5 | -23 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/Entity/User.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/Entity/User.java) | Java | -59 | -4 | -14 | -77 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/SecurityContext/Context.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/SecurityContext/Context.java) | Java | -24 | -1 | -9 | -34 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/config/PasswordEncoderUtil.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/config/PasswordEncoderUtil.java) | Java | -8 | 0 | -3 | -11 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/controller/AdminController.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/controller/AdminController.java) | Java | -71 | 0 | -17 | -88 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/controller/AdminDashController.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/controller/AdminDashController.java) | Java | -43 | 0 | -11 | -54 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/controller/LoginController.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/controller/LoginController.java) | Java | -23 | 0 | -4 | -27 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/controller/UserController.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/controller/UserController.java) | Java | -54 | 0 | -11 | -65 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/controller/UserDashController.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/controller/UserDashController.java) | Java | -32 | 0 | -10 | -42 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/repository/QuestionRepository.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/repository/QuestionRepository.java) | Java | -10 | 0 | -6 | -16 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/repository/StudentRepository.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/repository/StudentRepository.java) | Java | -5 | 0 | -5 | -10 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/repository/SubmissionRepository.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/repository/SubmissionRepository.java) | Java | -5 | 0 | -5 | -10 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/repository/TestRepository.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/repository/TestRepository.java) | Java | -5 | 0 | -5 | -10 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/repository/UserRepository.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/repository/UserRepository.java) | Java | -9 | 0 | -6 | -15 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/security/AuthenticationSuccessHandler.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/security/AuthenticationSuccessHandler.java) | Java | -25 | 0 | -12 | -37 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/security/SpringSecurityConfig.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/security/SpringSecurityConfig.java) | Java | -37 | -13 | -10 | -60 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/services/QuestionService.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/services/QuestionService.java) | Java | -8 | 0 | -3 | -11 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/services/StudentService.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/services/StudentService.java) | Java | -5 | 0 | -3 | -8 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/services/SubmissionService.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/services/SubmissionService.java) | Java | -5 | 0 | -3 | -8 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/services/TestService.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/services/TestService.java) | Java | -10 | 0 | -5 | -15 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/services/UserService.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/services/UserService.java) | Java | -5 | 0 | -3 | -8 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/services/impl/CustomUserDetailService.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/services/impl/CustomUserDetailService.java) | Java | -16 | 0 | -7 | -23 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/services/impl/QuestionServiceImpl.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/services/impl/QuestionServiceImpl.java) | Java | -33 | 0 | -13 | -46 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/services/impl/StudentServiceImpl.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/services/impl/StudentServiceImpl.java) | Java | -10 | 0 | -6 | -16 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/services/impl/SubmissionServiceImpl.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/services/impl/SubmissionServiceImpl.java) | Java | -18 | 0 | -7 | -25 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/services/impl/TestServiceImpl.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/services/impl/TestServiceImpl.java) | Java | -28 | 0 | -10 | -38 |
| [/Users/saugatsingh/app/src/main/java/com/kjlc/app/services/impl/UserServiceImpl.java](//Users/saugatsingh/app/src/main/java/com/kjlc/app/services/impl/UserServiceImpl.java) | Java | -20 | 0 | -7 | -27 |
| [/Users/saugatsingh/app/src/main/resources/application.properties](//Users/saugatsingh/app/src/main/resources/application.properties) | Java Properties | -5 | 0 | -1 | -6 |
| [/Users/saugatsingh/app/src/main/resources/static/assets/brand/bootstrap-logo-white.svg](//Users/saugatsingh/app/src/main/resources/static/assets/brand/bootstrap-logo-white.svg) | XML | -1 | 0 | 0 | -1 |
| [/Users/saugatsingh/app/src/main/resources/static/assets/brand/bootstrap-logo.svg](//Users/saugatsingh/app/src/main/resources/static/assets/brand/bootstrap-logo.svg) | XML | -1 | 0 | -1 | -2 |
| [/Users/saugatsingh/app/src/main/resources/static/assets/dist/css/bootstrap.min.css](//Users/saugatsingh/app/src/main/resources/static/assets/dist/css/bootstrap.min.css) | CSS | -2 | -4 | 0 | -6 |
| [/Users/saugatsingh/app/src/main/resources/static/assets/dist/css/bootstrap.rtl.min.css](//Users/saugatsingh/app/src/main/resources/static/assets/dist/css/bootstrap.rtl.min.css) | CSS | -2 | -4 | 0 | -6 |
| [/Users/saugatsingh/app/src/main/resources/static/assets/dist/js/bootstrap.bundle.min.js](//Users/saugatsingh/app/src/main/resources/static/assets/dist/js/bootstrap.bundle.min.js) | JavaScript | -1 | -6 | 0 | -7 |
| [/Users/saugatsingh/app/src/main/resources/static/css/CreateTest.css](//Users/saugatsingh/app/src/main/resources/static/css/CreateTest.css) | CSS | -7 | 0 | -1 | -8 |
| [/Users/saugatsingh/app/src/main/resources/static/css/dashboard.css](//Users/saugatsingh/app/src/main/resources/static/css/dashboard.css) | CSS | -85 | -10 | -16 | -111 |
| [/Users/saugatsingh/app/src/main/resources/static/css/dashboard.rtl.css](//Users/saugatsingh/app/src/main/resources/static/css/dashboard.rtl.css) | CSS | -66 | -6 | -17 | -89 |
| [/Users/saugatsingh/app/src/main/resources/static/css/login.css](//Users/saugatsingh/app/src/main/resources/static/css/login.css) | CSS | -69 | 0 | -15 | -84 |
| [/Users/saugatsingh/app/src/main/resources/static/css/login_.css](//Users/saugatsingh/app/src/main/resources/static/css/login_.css) | CSS | -155 | 0 | -8 | -163 |
| [/Users/saugatsingh/app/src/main/resources/static/css/register.css](//Users/saugatsingh/app/src/main/resources/static/css/register.css) | CSS | -154 | 0 | -7 | -161 |
| [/Users/saugatsingh/app/src/main/resources/static/js/dashboard.js](//Users/saugatsingh/app/src/main/resources/static/js/dashboard.js) | JavaScript | -47 | -3 | -4 | -54 |
| [/Users/saugatsingh/app/src/main/resources/static/js/login.js](//Users/saugatsingh/app/src/main/resources/static/js/login.js) | JavaScript | -59 | 0 | -12 | -71 |
| [/Users/saugatsingh/app/src/main/resources/templates/createTest.html](//Users/saugatsingh/app/src/main/resources/templates/createTest.html) | HTML | -260 | -1 | -23 | -284 |
| [/Users/saugatsingh/app/src/main/resources/templates/forgot.html](//Users/saugatsingh/app/src/main/resources/templates/forgot.html) | HTML | -51 | 0 | -2 | -53 |
| [/Users/saugatsingh/app/src/main/resources/templates/home.html](//Users/saugatsingh/app/src/main/resources/templates/home.html) | HTML | -249 | -16 | -19 | -284 |
| [/Users/saugatsingh/app/src/main/resources/templates/login.html](//Users/saugatsingh/app/src/main/resources/templates/login.html) | HTML | -71 | 0 | -6 | -77 |
| [/Users/saugatsingh/app/src/main/resources/templates/register.html](//Users/saugatsingh/app/src/main/resources/templates/register.html) | HTML | -75 | -3 | -7 | -85 |
| [/Users/saugatsingh/app/src/main/resources/templates/reset.html](//Users/saugatsingh/app/src/main/resources/templates/reset.html) | HTML | -52 | 0 | -2 | -54 |
| [/Users/saugatsingh/app/src/main/resources/templates/test-2.html](//Users/saugatsingh/app/src/main/resources/templates/test-2.html) | HTML | -107 | 0 | -16 | -123 |
| [/Users/saugatsingh/app/src/main/resources/templates/test-3.html](//Users/saugatsingh/app/src/main/resources/templates/test-3.html) | HTML | -38 | 0 | -4 | -42 |
| [/Users/saugatsingh/app/src/main/resources/templates/test.html](//Users/saugatsingh/app/src/main/resources/templates/test.html) | HTML | -28 | 0 | -4 | -32 |
| [/Users/saugatsingh/app/src/main/resources/templates/testView.html](//Users/saugatsingh/app/src/main/resources/templates/testView.html) | HTML | -9 | 0 | 0 | -9 |
| [/Users/saugatsingh/app/src/test/java/com/kjlc/app/AppApplicationTests.java](//Users/saugatsingh/app/src/test/java/com/kjlc/app/AppApplicationTests.java) | Java | -9 | 0 | -5 | -14 |

[Summary](results.md) / [Details](details.md) / [Diff Summary](diff.md) / Diff Details