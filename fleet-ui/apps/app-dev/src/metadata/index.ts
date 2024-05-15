import { metadata } from "@fleet/base";

import UserModel from './model/UserModel';
import UserProfileModel from './model/UserProfileModel';

import UserTypeEnum from "./enumeration/UserTypeEnum";

metadata.setModel(UserModel);
metadata.setModel(UserProfileModel);

metadata.setEnumeration(UserTypeEnum);
