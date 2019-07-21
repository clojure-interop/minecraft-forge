(ns net.minecraftforge.server.permission.DefaultPermissionHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.permission DefaultPermissionHandler]))

(def INSTANCE
  "Enum Constant.

  type: net.minecraftforge.server.permission.DefaultPermissionHandler"
  DefaultPermissionHandler/INSTANCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (DefaultPermissionHandler c : DefaultPermissionHandler.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.server.permission.DefaultPermissionHandler[]`"
  ([]
    (DefaultPermissionHandler/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.server.permission.DefaultPermissionHandler`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.server.permission.DefaultPermissionHandler [^java.lang.String name]
    (DefaultPermissionHandler/valueOf name)))

(defn register-node
  "Description copied from interface: IPermissionHandler

  node - `java.lang.String`
  level - `net.minecraftforge.server.permission.DefaultPermissionLevel`
  desc - `java.lang.String`"
  ([^DefaultPermissionHandler this ^java.lang.String node ^net.minecraftforge.server.permission.DefaultPermissionLevel level ^java.lang.String desc]
    (-> this (.registerNode node level desc))))

(defn get-registered-nodes
  "returns: Immutable collection of all registered nodes - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^DefaultPermissionHandler this]
    (-> this (.getRegisteredNodes))))

(defn has-permission?
  "Description copied from interface: IPermissionHandler

  profile - `com.mojang.authlib.GameProfile`
  node - `java.lang.String`
  context - `net.minecraftforge.server.permission.context.IContext`

  returns: `boolean`"
  (^Boolean [^DefaultPermissionHandler this ^com.mojang.authlib.GameProfile profile ^java.lang.String node ^net.minecraftforge.server.permission.context.IContext context]
    (-> this (.hasPermission profile node context))))

(defn get-node-description
  "node - Permission node - `java.lang.String`

  returns: Description of the node. \"\" in case this node doesn't have a decription - `java.lang.String`"
  (^java.lang.String [^DefaultPermissionHandler this ^java.lang.String node]
    (-> this (.getNodeDescription node))))

(defn get-default-permission-level
  "node - `java.lang.String`

  returns: The default permission level of a node. If the permission isn't registred, it will return NONE - `net.minecraftforge.server.permission.DefaultPermissionLevel`"
  (^net.minecraftforge.server.permission.DefaultPermissionLevel [^DefaultPermissionHandler this ^java.lang.String node]
    (-> this (.getDefaultPermissionLevel node))))

