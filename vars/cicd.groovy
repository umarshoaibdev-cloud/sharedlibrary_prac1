def downloadGit(repo_name)
{
  git "https://github.com/IntelliqDevops/${repo_name}.git"
}
def buildArtifact()
{
  sh 'mvn package'
}
