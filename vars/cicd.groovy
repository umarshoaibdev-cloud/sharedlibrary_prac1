def downloadGit(repo_name)
{
  git "https://github.com/IntelliqDevops/${repo_name}.git"
}
def buildArtifact()
{
  sh 'mvn package'
}
def deployToTomcat(job_name,ip_address,context)
{
  sh "scp /var/lib/jenkins/workspace/${job_name}/webapp/target/webapp.war ubuntu@${ip_address}:/var/lib/tomcat10/webapps/${context}.jar"
}
