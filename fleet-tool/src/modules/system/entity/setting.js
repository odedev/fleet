import { EntitySchema } from "typeorm";

const Setting = new EntitySchema({
  name: 'Setting',
  tableName: 'setting',
  columns: {
    id: {
      type: 'varchar',
      primary: true,
      generated: 'uuid',
    },
    usernames: {
      type: 'varchar',
      nullable: true,
    },
    code: {
      type: 'varchar',
      nullable: true,
    },
    name: {
      type: 'varchar'
    },
    age: {
      type: 'int',
      nullable: true,
    }
  }
});

export default Setting;
