package xyz.askway.service.serviceImpl;

import org.springframework.stereotype.Service;
import xyz.askway.dao.ProgramaDao;
import xyz.askway.pojo.Programa;
import xyz.askway.service.ProgramaService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Uncle Liu
 * @ClassName: ProgramaImpl
 * @Description: TODO(类说明 ：)
 * @date 2018/10/30 18:39
 */
@Service("programaImpl")
public class ProgramaImpl implements ProgramaService {
    @Resource
    private ProgramaDao programaDao;
    @Override
    public List<Programa> selectPrograma() {
        return programaDao.selectPrograma();
    }

    @Override
    public Programa getProgramaById(Integer pId) {
        return programaDao.getProgramaById(pId);
    }
    @Override
    public Programa getProgramaById1(Integer pId) {
        return programaDao.getProgramaById1(pId);
    }

    @Override
    public void addPrograma(Programa programa) {
        programaDao.addPrograma(programa);
    }

    @Override
    public int deletePrograma(Integer pId) {
        return programaDao.deletePrograma(pId);
    }

    @Override
    public int updatePrograma(Programa programa) {
        return programaDao.updatePrograma(programa);
    }
}
