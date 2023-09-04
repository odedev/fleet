import {ok, error} from "../../../core/response.js";
import {uuid} from "../../../utils/id_utils.js";

async function getUUID(req, res) {
  let ids = [];
  for (let i = 0; i < 100; i++) {
    ids.push(uuid());
  }
  res.json(ok(ids));
}

export default {
  getUUID,
}
