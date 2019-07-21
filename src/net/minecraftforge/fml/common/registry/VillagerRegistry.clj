(ns net.minecraftforge.fml.common.registry.VillagerRegistry
  "Registry for villager trading control"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry VillagerRegistry]))

(def *-professions
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  VillagerRegistry/PROFESSIONS)

(defn *instance
  "returns: `net.minecraftforge.fml.common.registry.VillagerRegistry`"
  (^net.minecraftforge.fml.common.registry.VillagerRegistry []
    (VillagerRegistry/instance )))

(defn *add-extra-village-components
  "list - `java.util.List`
  random - `java.util.Random`
  i - `int`"
  ([^java.util.List list ^java.util.Random random ^Integer i]
    (VillagerRegistry/addExtraVillageComponents list random i)))

(defn *get-village-component
  "village-piece - `net.minecraft.world.gen.structure.StructureVillagePieces$PieceWeight`
  start-piece - `net.minecraft.world.gen.structure.StructureVillagePieces$Start`
  pieces - `java.util.List`
  random - `java.util.Random`
  p-1 - `int`
  p-2 - `int`
  p-3 - `int`
  facing - `net.minecraft.util.EnumFacing`
  p-5 - `int`

  returns: `net.minecraft.world.gen.structure.StructureVillagePieces$Village`"
  (^net.minecraft.world.gen.structure.StructureVillagePieces$Village [^net.minecraft.world.gen.structure.StructureVillagePieces$PieceWeight village-piece ^net.minecraft.world.gen.structure.StructureVillagePieces$Start start-piece ^java.util.List pieces ^java.util.Random random ^Integer p-1 ^Integer p-2 ^Integer p-3 ^net.minecraft.util.EnumFacing facing ^Integer p-5]
    (VillagerRegistry/getVillageComponent village-piece start-piece pieces random p-1 p-2 p-3 facing p-5)))

(defn *set-random-profession
  "Hook called when spawning a Villager, sets it's profession to a random registered profession.

  entity - The new entity - `net.minecraft.entity.passive.EntityVillager`
  rand - The world's RNG - `java.util.Random`"
  ([^net.minecraft.entity.passive.EntityVillager entity ^java.util.Random rand]
    (VillagerRegistry/setRandomProfession entity rand)))

(defn *on-set-profession
  "entity - `net.minecraft.entity.passive.EntityVillager`
  network - `int`"
  ([^net.minecraft.entity.passive.EntityVillager entity ^Integer network]
    (VillagerRegistry/onSetProfession entity network)))

(defn *get-by-id
  "Deprecated.

  network - `int`

  returns: `net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession`"
  (^net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession [^Integer network]
    (VillagerRegistry/getById network)))

(defn *get-id
  "Deprecated.

  prof - `net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession`

  returns: `int`"
  (^Integer [^net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession prof]
    (VillagerRegistry/getId prof)))

(defn register-village-creation-handler
  "Register a new village creation handler

  handler - `net.minecraftforge.fml.common.registry.VillagerRegistry$IVillageCreationHandler`"
  ([^VillagerRegistry this ^net.minecraftforge.fml.common.registry.VillagerRegistry$IVillageCreationHandler handler]
    (-> this (.registerVillageCreationHandler handler))))

(defn register
  "prof - `net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession`"
  ([^VillagerRegistry this ^net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession prof]
    (-> this (.register prof))))

(defn get-registry
  "returns: `net.minecraftforge.fml.common.registry.IForgeRegistry<net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession>`"
  (^net.minecraftforge.fml.common.registry.IForgeRegistry [^VillagerRegistry this]
    (-> this (.getRegistry))))

