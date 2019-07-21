(ns net.minecraftforge.fml.common.registry.GameData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry GameData]))

(defn ->game-data
  "Constructor."
  (^GameData []
    (new GameData )))

(defn *get-block-item-map
  "returns: `com.google.common.collect.BiMap<net.minecraft.block.Block,net.minecraft.item.Item>`"
  (^com.google.common.collect.BiMap []
    (GameData/getBlockItemMap )))

(defn *get-entity-registry
  "Deprecated.

  returns: `net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry<net.minecraftforge.fml.common.registry.EntityEntry>`"
  (^net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry []
    (GameData/getEntityRegistry )))

(defn *get-biome-registry
  "Deprecated.

  returns: `net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry<net.minecraft.world.biome.Biome>`"
  (^net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry []
    (GameData/getBiomeRegistry )))

(defn *get-enchantment-registry
  "Deprecated.

  returns: `net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry<net.minecraft.enchantment.Enchantment>`"
  (^net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry []
    (GameData/getEnchantmentRegistry )))

(defn *get-potion-registry
  "Deprecated.

  returns: `net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry<net.minecraft.potion.Potion>`"
  (^net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry []
    (GameData/getPotionRegistry )))

(defn *get-block-registry
  "Deprecated.

  returns: `net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry<net.minecraft.block.Block>`"
  (^net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry []
    (GameData/getBlockRegistry )))

(defn *get-item-registry
  "Deprecated.

  returns: `net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry<net.minecraft.item.Item>`"
  (^net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry []
    (GameData/getItemRegistry )))

(defn *vanilla-snapshot
  ""
  ([]
    (GameData/vanillaSnapshot )))

(defn *get-sound-event-registry
  "Deprecated.

  returns: `net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry<net.minecraft.util.SoundEvent>`"
  (^net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry []
    (GameData/getSoundEventRegistry )))

(defn *get-tile-entity-registry
  "Deprecated.

  returns: `net.minecraftforge.fml.common.registry.LegacyNamespacedRegistry<java.lang.Class<? extends net.minecraft.tileentity.TileEntity>>`"
  ([]
    (GameData/getTileEntityRegistry )))

(defn *get-potion-types-registry
  "Deprecated.

  returns: `net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry<net.minecraft.potion.PotionType>`"
  (^net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry []
    (GameData/getPotionTypesRegistry )))

(defn *get-block-state-id-map
  "returns: `net.minecraft.util.ObjectIntIdentityMap<net.minecraft.block.state.IBlockState>`"
  (^net.minecraft.util.ObjectIntIdentityMap []
    (GameData/getBlockStateIDMap )))

(defn make-delegate
  "obj - `T`
  root-class - `java.lang.Class`

  returns: `<T extends net.minecraftforge.fml.common.registry.IForgeRegistryEntry<T>> net.minecraftforge.fml.common.registry.RegistryDelegate<T>`"
  ([^GameData this obj ^java.lang.Class root-class]
    (-> this (.makeDelegate obj root-class))))

