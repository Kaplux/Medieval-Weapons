package fr.mildlyusefulsoftware.medievalweapons.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import fr.mildlyusefulsoftware.imageviewer.service.DatabaseHelper;
import fr.mildlyusefulsoftware.imageviewer.service.Picture;

public class ViewPictureActivity extends fr.mildlyusefulsoftware.imageviewer.activity.ViewPictureActivity {

	@Override
	protected String getAdMobId() {
		return "a1501e48e2cd530";
	}

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//putNewPictures();
	}
	
	private void putNewPictures(){
		String[] url =new String[]{
				"http://www.medievalwarfare.info/pics/falchion.jpg",
				"http://3.bp.blogspot.com/_R8TOYRBucik/TMoZxuk3cQI/AAAAAAAAAA4/T2yDE25Vv_w/s1600/Medieval+Dual+Flail+33.jpg",
				"http://www.stormthecastle.com/images/albionhandbattleaxe",
				"http://www.medievalwarfare.info/pics/spear_02.jpg",
				"http://minimumwagehistorian.files.wordpress.com/2012/01/battle-axe.jpg",
				"http://farm3.static.flickr.com/2789/4387874401_f16b3080a5.jpg",
				"http://www.medieval-weapons-online.com/prodimages-cdls/G/G-GMI-CB24-3-L.jpg",
				"http://www.heavenlyswords.com/images/T/06-40.jpg",
				"http://preview.turbosquid.com/Preview/Content_2010_02_05__16_12_24/club1.jpga166f34d-e3a4-4a84-bd26-718da365f027Larger.jpg",
				"http://myimages.bravenet.com/204/089/408/1/daggers.jpg",
				"http://preview.turbosquid.com/Preview/2010/12/02__19_06_00/melee%20weapons.jpg7c90a985-5915-434e-83a4-8f37044c2948Larger.jpg",
				"http://www.edgeimport.com/images/060191556261.jpg",
				"http://1800hart.com/picks/wp-content/Fantasy_Swords_Molotoch__The_Slaye_KR0013_1624.jpg",
				"http://1800hart.com/picks/wp-content/Swords_Argonaut_Sword_UC1416_1658.jpg",
				"http://swords-usa.com/images/PK335-205.jpg",
				"http://www.polyvore.com/cgi/img-thing?.out=jpg&size=l&tid=1023010",
				"http://www.medievalweaponinfo.com/wp-content/uploads/2010/06/dirkslarge.jpg",
				"http://medievalcostumesandgifts.com/images/product-images/medieval_sword_wp_12326_amz.jpg",
				"http://www.polyvore.com/cgi/img-thing?.out=jpg&size=l&tid=1023012",
				"http://www.historyshop.piratemerch.com/images/medieval_sword_06_02.jpg",
				"http://www.gungfu.com/media/products/weapons/medieval-weapons/weapons-medieval-flails-bf-traditional-spiked.jpg",
				"http://www.painetworks.com/photos/id/id2825.JPG",
				"http://www.polyvore.com/cgi/img-thing?.out=jpg&size=l&tid=1023038",
				"http://www.gungfu.com/media/products/weapons/medieval-weapons/weapons-medieval-flails-bf-traditional-spiked-steel-ball-detailed-view.jpg",
				"http://www.pirateclothings.com/wp-content/uploads/2012/02/Medieval-Helmets.jpg",
				"http://files.sharenator.com/mace_medieval_weapon_2_What_is_your_choice_melee_weapon_for_a_zombie_apocalypse-s650x488-128019-580.jpg",
				"http://www.knifeworks.com/ProductImages/united/kr12.jpg",
				"http://www.scottishmist.com/assets/weapons/13th_Cent_Sword.jpg",
				"http://www.medieval-weapons-online.com/prodimages-cdls/G/g-gmi-ha14-z-L.jpg",
				"http://thevikingweaponsstore.com/images/Medieval_Mace_KE4638.jpg",
				"http://getasword.com/blog/wp-content/uploads/2010/07/Flanged-Mace.jpg",
				"http://www.dragonswordsndaggers.com/files/1581793/uploaded/CHHK-57022.jpg",
				"http://www.blank-guns-depot.com/blank-firing-guns-store/files/productpics1/detailed_images/d_1306.jpg",
				"http://3.bp.blogspot.com/_fRgUzQx-8ck/TEWwF5QMJgI/AAAAAAAAAaY/ZrgGap5tsUU/s1600/crossbow.jpg",
				"http://www.swordsknivesanddaggers.com/medieval-weapons/medieval-weapons-medieval-extreme-battle-axe-gt-882437.gif",
				"http://www.heavenlyswords.com/images/P/medieval%20style%20rapier%20sword.jpg",
				"http://www.the3dmodelstore.com/img/axe1.jpg",
				"http://www.gungfu.com/media/products/weapons/medieval-weapons/weapons-medieval-flails-bf-traditional-spiked-steel-ball-detailed-view.jpg",
				"http://zenseeker.net/Kid/KnightWeapons/MacesSmall.jpg",
				"http://cls-social-studies.wikispaces.com/file/view/Cold-Steel-88WGS-rw-11877-22213.jpg/204787168/Cold-Steel-88WGS-rw-11877-22213.jpg",
				"http://www.horror-shop.com/out/pictures/generated/product/1/350_600_75/ritter_schwert_mit_scheide-knight_sword_with_sheath-8800099.jpg",
				"http://www.votesprout.com/replica-images/replica-weapons-MD3069.jpg"
				
		};
		int i=40;
		List<Picture> pictures=new ArrayList<Picture>();
		for (int j=0;j<url.length;j++){
			try {
				Log.i("medievalweapons",url[j]);
				Picture p = new Picture(j+i, url[j],Picture.getPictureThumbnail(url[j]));
				pictures.add(p);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		DatabaseHelper.connect(this).putPictures(pictures);
	}


}
