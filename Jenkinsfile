pipeline{
    
    agent any
    stages{
        
        stage('i am going to print Tejaswi'){
           steps{
               echo 'Hi Tejaswi'
           }
        }
        
        stage('checkout'){
            steps{
                git credentialsId: '1b2d0e23-b859-41a8-8ca0-3f1ac889dd2f', url: 'https://github.com/thejaswimalepati/APITest'
            }
        }
        
        stage('Maven Build'){
            steps{
                bat 'mvn test'
            }
        }
        
        
    }
    
    post{
        always{
            
            emailext body: 'REST Assured', 
            subject: 'API_Test_Result', 
            to: 'tejaswimalepati92@gmail.com'
            
        }
        
    }
    
    
    
}
