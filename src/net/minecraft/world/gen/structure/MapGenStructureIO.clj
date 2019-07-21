(ns net.minecraft.world.gen.structure.MapGenStructureIO
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure MapGenStructureIO]))

(defn ->map-gen-structure-io
  "Constructor."
  (^MapGenStructureIO []
    (new MapGenStructureIO )))

(defn *register-structure
  "start-class - `java.lang.Class`
  structure-name - `java.lang.String`"
  ([^java.lang.Class start-class ^java.lang.String structure-name]
    (MapGenStructureIO/registerStructure start-class structure-name)))

(defn *register-structure-component
  "component-class - `java.lang.Class`
  component-name - `java.lang.String`"
  ([^java.lang.Class component-class ^java.lang.String component-name]
    (MapGenStructureIO/registerStructureComponent component-class component-name)))

(defn *get-structure-start-name
  "start - `net.minecraft.world.gen.structure.StructureStart`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraft.world.gen.structure.StructureStart start]
    (MapGenStructureIO/getStructureStartName start)))

(defn *get-structure-component-name
  "component - `net.minecraft.world.gen.structure.StructureComponent`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraft.world.gen.structure.StructureComponent component]
    (MapGenStructureIO/getStructureComponentName component)))

(defn *get-structure-start
  "tag-compound - `net.minecraft.nbt.NBTTagCompound`
  world-in - `net.minecraft.world.World`

  returns: `net.minecraft.world.gen.structure.StructureStart`"
  (^net.minecraft.world.gen.structure.StructureStart [^net.minecraft.nbt.NBTTagCompound tag-compound ^net.minecraft.world.World world-in]
    (MapGenStructureIO/getStructureStart tag-compound world-in)))

(defn *get-structure-component
  "tag-compound - `net.minecraft.nbt.NBTTagCompound`
  world-in - `net.minecraft.world.World`

  returns: `net.minecraft.world.gen.structure.StructureComponent`"
  (^net.minecraft.world.gen.structure.StructureComponent [^net.minecraft.nbt.NBTTagCompound tag-compound ^net.minecraft.world.World world-in]
    (MapGenStructureIO/getStructureComponent tag-compound world-in)))

