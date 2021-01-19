package noodlewrecker7.divinetools.item;

import net.minecraft.item.Item;
import noodlewrecker7.divinetools.DivineTools;

public class ItemIngotDivinite extends Item {

    ItemIngotDivinite(){
//        super();
         setRegistryName(DivineTools.MODID, "itemingotdivinite");
         setUnlocalizedName(getRegistryName().toString());
         setCreativeTab(DivineTools.MOD_TAB);
         setMaxStackSize(256);

    }
}
