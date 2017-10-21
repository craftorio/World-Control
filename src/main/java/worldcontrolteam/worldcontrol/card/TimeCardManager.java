package worldcontrolteam.worldcontrol.card;

import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import worldcontrolteam.worldcontrol.api.card.Card;
import worldcontrolteam.worldcontrol.api.card.CardManager;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class TimeCardManager extends CardManager {
    public TimeCardManager() {
        setRegistryName("time");
    }

    @Override
    public boolean isValidBlock(World world, BlockPos pos) {
        return true;
    }

    @Override
    public boolean hasKit() {
        return false;
    }

    @Override
    public Card createCard(@Nonnull ItemStack stack, @Nullable BlockPos pos, @Nullable EnumFacing facing) {
        return new TimeCard(stack, this);
    }
}