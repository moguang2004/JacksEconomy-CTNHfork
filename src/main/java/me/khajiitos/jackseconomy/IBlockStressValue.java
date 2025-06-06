package me.khajiitos.jackseconomy;

import me.khajiitos.jackseconomy.config.Config;
import me.khajiitos.jackseconomy.init.ItemBlockReg;
import net.createmod.catnip.data.Couple;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;

public class IBlockStressValue {
    public static double getImpact(Block block) {
        if (block == ItemBlockReg.MECHANICAL_EXPORTER.get()) {
            return Config.mechanicalExporterStressPerRPM.get();
        } else if (block == ItemBlockReg.MECHANICAL_IMPORTER.get()) {
            return Config.mechanicalImporterStressPerRPM.get();
        }
        return 0;
    }
    public static double getCapacity(Block block) {
        return 0;
    }
    public boolean hasImpact(Block block) {
        return getImpact(block) != 0;
    }

    public boolean hasCapacity(Block block) {
        return false;
    }
    @Nullable
    public Couple<Integer> getGeneratedRPM(Block block) {
        return null;
    }

}
