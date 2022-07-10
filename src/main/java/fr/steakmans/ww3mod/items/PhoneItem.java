package fr.steakmans.ww3mod.items;

import fr.steakmans.ww3mod.Main;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.world.World;

public class PhoneItem extends Item {

    public PhoneItem() {
        super(new Properties().group(Main.TAB).maxStackSize(1));
    }

    @Override
    public void onUse(World p_219972_1_, LivingEntity p_219972_2_, ItemStack p_219972_3_, int p_219972_4_) {
        super.onUse(p_219972_1_, p_219972_2_, p_219972_3_, p_219972_4_);
        System.out.println("used");
    }
}
