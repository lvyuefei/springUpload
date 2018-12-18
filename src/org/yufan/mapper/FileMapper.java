package org.yufan.mapper;

import java.util.List;

import org.yufan.bean.File;

public interface FileMapper {

	public List<File> queryFileByWhere(File record);

	public void saveFile(File file);

	public void updateFile(File file);

	public void deleteFileById(Integer fileId);
}
