package net.adventurez.init;

import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;
import net.minecraft.nbt.CompoundTag;
//import net.minecraft.client.item.ModelPredicateProviderRegistry;

public class ModelProviderInit {

  public static void init() {
    FabricModelPredicateProviderRegistry.register(ItemInit.STONE_GOLEM_ARM, new Identifier("lavalight"),
        (stack, world, entity) -> {
          CompoundTag tags = stack.getTag();
          if (stack.hasTag() && tags.getBoolean("lavalight")) {
            return 1F;
          }
          return 0F;
        });

  }

}