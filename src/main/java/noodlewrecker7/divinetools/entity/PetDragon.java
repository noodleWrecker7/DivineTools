package noodlewrecker7.divinetools.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityFlying;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class PetDragon extends EntityTameable implements EntityFlying {
    public PetDragon(World worldIn) {
        super(worldIn);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

//        getEntityAttribute(SharedMonsterAttributes.FLYING_SPEED).setBaseValue(0.4D);

    }

    @Nullable
    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return null;
    }

}
