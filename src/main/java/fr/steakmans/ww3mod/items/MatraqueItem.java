package fr.steakmans.ww3mod.items;

import fr.steakmans.ww3mod.Main;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class MatraqueItem extends Item {

    public MatraqueItem() {
        super(new Properties().maxStackSize(1).setNoRepair().group(Main.TAB));
    }


    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        return super.hitEntity(stack, target, attacker);
    }
}
