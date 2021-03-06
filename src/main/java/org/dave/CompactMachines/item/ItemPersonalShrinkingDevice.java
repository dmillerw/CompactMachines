package org.dave.CompactMachines.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import org.dave.CompactMachines.CompactMachines;
import org.dave.CompactMachines.handler.ConfigurationHandler;
import org.dave.CompactMachines.reference.Names;

public class ItemPersonalShrinkingDevice extends ItemCM
{
    public ItemPersonalShrinkingDevice()
    {
        super();
        this.setUnlocalizedName(Names.Items.PSD);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
    	if(!world.isRemote && entityPlayer instanceof EntityPlayerMP) {
    		EntityPlayerMP serverPlayer = (EntityPlayerMP)entityPlayer;
    		if(world.provider.dimensionId == ConfigurationHandler.dimensionId) {
    			CompactMachines.instance.machineHandler.teleportPlayerOutOfMachineWorld(serverPlayer);
    		}
    	}
    	return itemStack;
    }
}
