/*pipeline {
     agent any
     stages {
          stage("Compile") {
               steps {
                    sh "chmod +x gradlew" 
                    sh "./gradlew compileJava"
               }
          }
          stage("Unit test") {
               steps {
                    sh "./gradlew test"
               }
          }
          stage("Code coverage") {
              steps {
                  sh "./gradlew jacocoTestReport"
                  publishHTML (target: 
                  [reportDir: 'build/reports/jacoco/test/html',
                  reportFiles: 'index.html',
                  reportName: "JaCoCo Report"
                  ])
          sh "./gradlew jacocoTestCoverageVerification"
     }
     }
stage("Static code analysis") {     
steps {          
sh "./gradlew checkstyleMain"
publishHTML (target: [
     reportDir: 'build/reports/checkstyle/',
     reportFiles: 'main.html',
     reportName: "Checkstyle Report"
])
}}
stage("Package") {     
steps {          
sh "./gradlew build"     }}
          
              stage("Docker build") {     
                    steps {          
                         sh "docker build -t abhikuri/calculator ."     
                    }
               }
          stage('Docker Push') {
               steps {
                    withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) 
                    {
                         sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
                         sh 'docker push abhikuri/calculator'
                    }
               }
          }
          stage("Deploy to staging") {
               steps {
                    sh "docker run -d --rm -p 8765:8080 --name calculator abhikuri/calculator"
               }
          }
          stage("Acceptance test") {    
               steps {        
                    sleep 60
                    sh "chmod +x acceptance_test.sh" 
                    sh "./acceptance_test.sh"    
               }
               post {  
               always {
                    sh "docker stop calculator"
               }
          }
          }  
          
     }
}
*/


pipeline {
    agent any
    stages {
        stage("Compile") {
            steps {
                sh "chmod +x gradlew"
                sh "./gradlew compileJava"
            }
        }
        stage("Unit test") {
            steps {
                sh "./gradlew test"
            }
        }
        stage("Code coverage") {
            steps {
                sh "./gradlew jacocoTestReport"
                publishHTML(target: [reportDir: 'build/reports/jacoco/test/html',
                    reportFiles: 'index.html',
                    reportName: "JaCoCo Report"
                ])
                sh "./gradlew jacocoTestCoverageVerification"
            }
        }
        stage("Static code analysis") {
            steps {
                sh "./gradlew checkstyleMain"
                publishHTML(target: [
                    reportDir: 'build/reports/checkstyle/',
                    reportFiles: 'main.html',
                    reportName: "Checkstyle Report"
                ])
            }
        }
        stage("Package") {
            steps {
                sh "./gradlew build"
            }
        }
         stage ("Deploy to test environment"){
              steps {
              }
              stage ("Automated testing"){
              steps { echo 'insufficient resources'
              }
                   stage ("Deploy to Pre-prod environment"){
              steps {echo 'insufficient resources'
              }
                        stage ("Deploy to Prod environment"){
              steps {echo 'insufficient resources'
              }
         }

         
    }
}
             } 
