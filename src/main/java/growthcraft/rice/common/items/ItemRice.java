package growthcraft.rice.common.items;

import growthcraft.grapes.shared.Reference;
import growthcraft.grapes.shared.init.GrowthcraftGrapesItems.GrapeTypes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

public class ItemGrape extends ItemFood {
  
    public ItemRice(String unlocalizedName, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
        this.setHasSubtypes(true);
    }
  
  @Override
  public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> subItems) {
    if( !this.isInCreativeTab(tab) )
    return;
    for ( int i = 0; i < RiceTypes.values().length; i++ ) {
    RiceTypes type = RiceTypes.values()[i];
    subItems.add(new ItemStack(this, 1, type.getVariantID()));
    }
  }
  
  @Override
  public String getUnlocalizedName(ItemStack stack) {
  for (int i = 0; i < RiceTypes.values().length; i++ ) {
  RiceTypes type = RiceTypes.values()[i];
  if ( stack.getItemDamage() == type.getVariantID() ) {
  return  this.getUnlocalizedName() + "." + type.getName();
  } else {
  continue;
  }
  }
  return super.getUnlocalizedName() + "." + RiceTypes.YAMADA_NISHIKI.getName();
  } 
  
  
}