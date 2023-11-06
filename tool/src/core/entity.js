import { EntitySchema } from "typeorm";


function entity(name, tableName, columns) {
  const idColumns = {
    id: {
      type: 'varchar',
      primary: true,
      generated: 'uuid',
    },
  };
  const commonColumns = {
    version: {
      version: true,
    },
    createdAt: {
      createDate: true
    },
    updatedAt: {
      updateDate: true
    },
    deletedAt: {
      deleteDate: true
    },
  };


  let column = Object.assign({}, idColumns, columns, commonColumns);

  return new EntitySchema({
    name: name,
    tableName: tableName,
    columns: column,
  })
}

export default entity;
