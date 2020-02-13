package codingkids.mc.block;

import codingkids.mc.block.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Wilson Wu on 2020/02/11.
 */
@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME,
        acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class BlockMod {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    public static Block myBlock;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        myBlock = new Block(new Material(MapColor.AIR));
        myBlock.setRegistryName("my_block");
        myBlock.setTranslationKey("ckblock.my_block");
        myBlock.setCreativeTab(CreativeTabs.COMBAT);
        myBlock.setHardness(0.5F);
        myBlock.setLightLevel(1.0f);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

}
