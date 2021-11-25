package org.springframework.core.io;

import org.junit.Test;

/**
 * @author ran.ding
 * @since 2021/11/25
 */
public class DingResourceLoaderTests {

	@Test
	public void testUrl() {
		ResourceLoader loader = new DefaultResourceLoader();
		// 这种路径的资源一般需要通过 FileSystemResourceLoader 来加载，DefaultResourceLoader 不识别，因为没有文件协议头。
		Resource fileResource1 = loader.getResource("C:\\Users\\e-ran.ding\\Desktop\\Resource.png");
		System.out.println("fileResource1 is " + fileResource1.getClass().getSimpleName());
		// 文件资源路径需要这样写，加上file协议头
		// see org.springframework.util.ResourceUtils.isFileURL
		Resource fileResource2 = loader.getResource("file://C:\\Users\\e-ran.ding\\Desktop\\Resource.png");
		System.out.println("fileResource2 is " + fileResource2.getClass().getSimpleName());
		Resource urlResource = loader.getResource(
				"https://ask.qcloudimg.com/http-save/yehe-3233770/sxt0975aw1.png?imageView2/2/w/1620");
		System.out.println("urlResource is " + urlResource.getClass().getSimpleName());
		Resource classPathResource = loader.getResource("classpath:log4j2-test.xml");
		System.out.println("classPathResource is " + classPathResource.getClass().getSimpleName());
		Resource classPathRelativeResource = loader.getResource("/log4j2-test.xml");
		System.out.println("classPathRelativeResource is " + classPathRelativeResource.getClass().getSimpleName());
	}

	@Test
	public void testFileSystemResourceLoader() {
		ResourceLoader loader = new FileSystemResourceLoader();
		Resource fileResource1 = loader.getResource("C:\\Users\\e-ran.ding\\Desktop\\Resource.png");
		System.out.println("fileResource1 exists? " + fileResource1.exists());
		System.out.println("fileResource1 is " + fileResource1.getClass().getSimpleName());
	}
}
