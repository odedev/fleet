import express from 'express';
import userController from "./controller/user_controller.js";
import settingController from "./controller/setting_controller.js";


const router = express.Router();

router.get('/system/user', userController.userView);
router.get('/system/user/save', userController.userSave);

router.get('/system/setting', settingController.settingView);

export default router;
