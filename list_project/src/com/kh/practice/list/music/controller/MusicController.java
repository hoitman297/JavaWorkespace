package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;
public class MusicController {
	List list = new ArrayList();
	public int addList(Music music) {
		list.add(music);
		return 1;
	}

	public int addZtZero(Music music) {
		list.add(0, music);
		return 1;
	}

	public List printAll() {
		return list;
	}
	public Music searchMusic(String title) {
		Music m = null;
		
		for(Object o : list) {
			Music music = (Music) o;
			if(music.getTitle().equals(title)) {
				m = music;
				break;
			}
		}
		
	    return m;
	}

	public Music removeMusic(String title) {
		Music m = null;
		
		for (int i = 0; i < list.size(); i++) {
			Music music = (Music) list.get(i);
			if (music.getTitle().equals(title)) {
				m = music;
				list.remove(i);
			}
		}
		return m;
	}

	public Music setMusic(String title, Music music) {
		try {
			Music result = null;
			int index = -1;
			for(int i = 0; i<list.size(); i++) {
				Music m = (Music)list.get(i);
				if (m.getTitle().equals(title)) {
					index = i;
					result = m;
					break;
				}
			}
			list.set(index, music);
			
			return result;
		} catch (Exception e) {
			return null;
		}
	}

	public int ascTitle() {
		Collections.sort(list);
	}

	public int descSinger() {
		
	}
}
