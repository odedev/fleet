import {ok, error} from "../../../core/response.js";
import userService from "../service/user_service.js";

function userView(req, res) {
  res.render('system/user', { title: 'Fleet user' });
}


async function userSave(req, res) {
  let user = {
    name: '1212112',
    code: '1212112',
    age: 12,
    username: 'user1'
  }
  let data = await userService.save(user);
  res.json(ok(data));
}

export default {
  userView,
  userSave,
}
