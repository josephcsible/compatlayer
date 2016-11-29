package mcjty.lib.compat;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.MapGenStructure;

public abstract class CompatMapGenStructure extends MapGenStructure {

    public abstract BlockPos clGetClosestStrongholdPos(World worldIn, BlockPos position);


    @Override
    public BlockPos getClosestStrongholdPos(World worldIn, BlockPos pos) {
        return clGetClosestStrongholdPos(worldIn, pos);
    }
}