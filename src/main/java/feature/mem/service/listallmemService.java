package feature.mem.service;

import feature.mem.dao.MemDao;
import feature.mem.dao.MemDaoImpl;
import feature.mem.vo.MemVo;

import java.sql.Date;
import java.util.List;

public class listallmemService {
    private MemDao memDao;

    public listallmemService() {
        memDao = new MemDaoImpl();
    }

    public List<MemVo> getAll() {
        return memDao.selectAll();
    }

    public MemVo getOneMem(Integer memNo) {
        return memDao.selectById(memNo);
    }

    public void deleteMem(Integer memNo) {
        memDao.delete(memNo);
    }

    public MemVo updateMem(Integer memNo, String memName, String memPid, String memEmail, String memPh, String memAddress, Date memBirth, Byte memAuth) {

        MemVo memVo = new MemVo();

        memVo.setMemNo(memNo);
        memVo.setMemName(memName);
        memVo.setMemPid(memPid);
        memVo.setMemEmail(memEmail);
        memVo.setMemPh(memPh);
        memVo.setMemAddress(memAddress);
        memVo.setMemBirth(memBirth);
        memVo.setMemAuth(memAuth);
        memDao.update(memVo);

        return memDao.selectById(memNo);
    }




}
