import AppDataSource from "../../../core/datasource.js";

const userRepository = AppDataSource.getRepository("user");

async function find() {
  let users = await userRepository.find();
  return users;
};

async function save(user) {
  let data = await userRepository.save(user);
  console.log("Post has been saved: ", data);
  return await find();
};

export default {
  find,
  save,
}
