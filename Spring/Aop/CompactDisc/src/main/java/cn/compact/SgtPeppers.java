package cn.compact;

import org.springframework.stereotype.Component;

/**
 * cd实现类<br>
 * create:2016-12-08 16:49
 *
 * @author zhou
 * @version 1.0
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String songName="July";
    private String author="Kris Wu";
    @Override
    public void play() {

        System.out.println("歌曲名："+songName+"作曲者:"+author);

    }
}
