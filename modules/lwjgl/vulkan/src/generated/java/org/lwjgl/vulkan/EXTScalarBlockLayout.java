/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * <h5>Short Description</h5>
 * 
 * <p>Enables C-like structure layout for SPIR-V blocks.</p>
 * 
 * <h5>Description</h5>
 * 
 * <p>This extension modifies the alignment rules for uniform buffers, storage buffers and push constants, allowing non-scalar types to be aligned solely based on the size of their components, without additional requirements.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_scalar_block_layout}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>222</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_scalar_block_layout:%20&amp;body=@tobski%20">tobski</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-11-14</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz</li>
 * <li>Jan-Harald Fredriksen</li>
 * <li>Graeme Leese</li>
 * <li>Jason Ekstrand</li>
 * <li>John Kessenich</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTScalarBlockLayout {

    /** The extension specification version. */
    public static final int VK_EXT_SCALAR_BLOCK_LAYOUT_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_SCALAR_BLOCK_LAYOUT_EXTENSION_NAME = "VK_EXT_scalar_block_layout";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES_EXT = 1000221000;

    private EXTScalarBlockLayout() {}

}