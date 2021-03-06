(ns net.minecraftforge.fml.common.registry.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[net.minecraftforge.fml.common.registry.EntityEntry])
(require '[net.minecraftforge.fml.common.registry.EntityRegistry])
(require '[net.minecraftforge.fml.common.registry.ExistingSubstitutionException])
(require '[net.minecraftforge.fml.common.registry.FMLControlledNamespacedRegistry])
(require '[net.minecraftforge.fml.common.registry.ForgeRegistries])
(require '[net.minecraftforge.fml.common.registry.GameData])
(require '[net.minecraftforge.fml.common.registry.GameRegistry$ItemStackHolder])
(require '[net.minecraftforge.fml.common.registry.GameRegistry$ObjectHolder])
(require '[net.minecraftforge.fml.common.registry.GameRegistry$Type])
(require '[net.minecraftforge.fml.common.registry.GameRegistry])
(require '[net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData])
(require '[net.minecraftforge.fml.common.registry.IForgeRegistry$AddCallback])
(require '[net.minecraftforge.fml.common.registry.IForgeRegistry$ClearCallback])
(require '[net.minecraftforge.fml.common.registry.IForgeRegistry$CreateCallback])
(require '[net.minecraftforge.fml.common.registry.IForgeRegistry$SubstitutionCallback])
(require '[net.minecraftforge.fml.common.registry.IForgeRegistry])
(require '[net.minecraftforge.fml.common.registry.IForgeRegistryEntry$Impl])
(require '[net.minecraftforge.fml.common.registry.IForgeRegistryEntry])
(require '[net.minecraftforge.fml.common.registry.IThrowableEntity])
(require '[net.minecraftforge.fml.common.registry.IncompatibleSubstitutionException])
(require '[net.minecraftforge.fml.common.registry.ItemStackHolderInjector])
(require '[net.minecraftforge.fml.common.registry.LegacyNamespacedRegistry])
(require '[net.minecraftforge.fml.common.registry.ObjectHolderRegistry])
(require '[net.minecraftforge.fml.common.registry.PersistentRegistryManager$GameDataSnapshot$Entry])
(require '[net.minecraftforge.fml.common.registry.PersistentRegistryManager$GameDataSnapshot])
(require '[net.minecraftforge.fml.common.registry.PersistentRegistryManager])
(require '[net.minecraftforge.fml.common.registry.RegistryBuilder])
(require '[net.minecraftforge.fml.common.registry.RegistryDelegate$Delegate])
(require '[net.minecraftforge.fml.common.registry.RegistryDelegate])
(require '[net.minecraftforge.fml.common.registry.VillagerRegistry$IVillageCreationHandler])
(require '[net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerCareer])
(require '[net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession])
(require '[net.minecraftforge.fml.common.registry.VillagerRegistry])
