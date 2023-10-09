
function getUserProfile(count: number): any[] {
  const data: any[] = [];

  for (let i = 0; i < count; i++) {
    let userProfile = {
      id: i,
      name: 'Dev' + i,
      code: 23000 + i + '',
      address: '32 Park Road, London',
      remark: 'jane.doe@example.com',
      isPreset: false,
      user: {
        id: '1',
        name: 'Jane Doe' + i,
        code: 23000,
      }
    };

    data.push(userProfile);
  }
  return data;
}



export default getUserProfile;
