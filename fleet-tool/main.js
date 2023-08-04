import AppDataSource from "./src/core/datasource.js";
import serve from "./src/core/server.js";

AppDataSource.initialize()
.then(() => {
  serve();
 let md = AppDataSource.getMetadata('User')
console.log(md);
  let user = {
    name: 'test',
    code: 'test',
    age: 12
  }
  var postRepository = AppDataSource.getRepository("User");
        postRepository
            .save(user)
            .then(function (savedPost) {
                console.log("Post has been saved: ", savedPost)
                console.log("Now lets load all posts: ")
                postRepository.find().then(data => {
                  console.log(data)
                })
            })
            .then(function (allPosts) {
                console.log("All posts: ", allPosts)
            })

})
.catch(err => {
  console.warn(err)
  process.exit(2);
})
