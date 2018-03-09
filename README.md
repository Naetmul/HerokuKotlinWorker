# HerokuKotlinWorker
A simple example Kotlin app for Heroku, which uses only one worker dyno (zero web dyno) for no dyno sleeping in Gradle

### What to Do after Deployment
`heroku ps:scale worker=1`
