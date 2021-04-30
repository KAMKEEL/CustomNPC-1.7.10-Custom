package noppes.npcs.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import noppes.npcs.CustomNpcs;
import noppes.npcs.ModelData;
import noppes.npcs.ModelPartData;
import noppes.npcs.client.EntityUtil;

public class EntityCustomNpc64 extends EntityCustomNpc{

	public EntityCustomNpc64(World world) {
		super(world);
		display.texture = "customnpcs:textures/entity/humanmale/Steve64.png";
	}

}
