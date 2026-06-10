// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelOgre<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "wfmmodelogre"), "main");
	private final ModelPart field_78112_f;
	private final ModelPart field_78124_i;
	private final ModelPart field_78116_c;
	private final ModelPart field_78115_e;
	private final ModelPart field_78113_g;
	private final ModelPart field_78123_h;
	private final ModelPart field_78121_j;

	public WFMModelOgre(ModelPart root) {
		this.field_78112_f = root.getChild("field_78112_f");
		this.field_78124_i = root.getChild("field_78124_i");
		this.field_78116_c = root.getChild("field_78116_c");
		this.field_78115_e = root.getChild("field_78115_e");
		this.field_78113_g = root.getChild("field_78113_g");
		this.field_78123_h = root.getChild("field_78123_h");
		this.field_78121_j = root.getChild("field_78121_j");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition field_78112_f = partdefinition.addOrReplaceChild("field_78112_f", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-9.1F, -3.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.0F, -23.0F, 0.0F, 0.0F, 0.0F, 0.1F));

		PartDefinition field_78112_fChild = field_78112_f.addOrReplaceChild("field_78112_fChild", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(2.1F, 30.0F, -5.0F, 10.0F, 20.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-12.0F, -23.0F, 0.0F));

		PartDefinition field_78124_i = partdefinition.addOrReplaceChild("field_78124_i", CubeListBuilder.create().texOffs(0, 78).addBox(-5.5F, 0.0F, -6.0F, 11.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, 0.0F));

		PartDefinition field_78124_iChild_1 = field_78124_i.addOrReplaceChild("field_78124_iChild_1", CubeListBuilder.create().texOffs(2, 110).mirror().addBox(-4.5F, 18.0F, -8.0F, 10.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition field_78124_iChild = field_78124_i.addOrReplaceChild("field_78124_iChild", CubeListBuilder.create().texOffs(0, 102).addBox(-10.5F, 12.0F, -5.0F, 10.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, 0.0F));

		PartDefinition field_78116_c = partdefinition.addOrReplaceChild("field_78116_c", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -10.0F, -7.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -30.0F, -1.0F));

		PartDefinition field_78116_cChild = field_78116_c.addOrReplaceChild("field_78116_cChild", CubeListBuilder.create().texOffs(40, 0).addBox(5.9F, -6.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition field_78116_cChild_2 = field_78116_c.addOrReplaceChild("field_78116_cChild_2", CubeListBuilder.create().texOffs(40, 0).mirror().addBox(-6.9F, -6.0F, -3.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition field_78116_cChild_1 = field_78116_c.addOrReplaceChild("field_78116_cChild_1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -8.1F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition field_78115_e = partdefinition.addOrReplaceChild("field_78115_e", CubeListBuilder.create().texOffs(48, 0).addBox(-11.0F, -28.0F, -8.0F, 22.0F, 28.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition field_78115_eChild_1 = field_78115_e.addOrReplaceChild("field_78115_eChild_1", CubeListBuilder.create().texOffs(52, 65).addBox(0.0F, 0.0F, -2.5F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -32.0F, -4.0F));

		PartDefinition field_78115_eChild = field_78115_e.addOrReplaceChild("field_78115_eChild", CubeListBuilder.create().texOffs(57, 42).addBox(-12.0F, -16.0F, -14.0F, 20.0F, 18.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 1.0F));

		PartDefinition field_78113_g = partdefinition.addOrReplaceChild("field_78113_g", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -3.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, -23.0F, 0.0F, 0.0F, 0.0F, -0.1F));

		PartDefinition field_78113_gChild = field_78113_g.addOrReplaceChild("field_78113_gChild", CubeListBuilder.create().texOffs(0, 48).addBox(0.9F, 30.0F, -5.0F, 10.0F, 20.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -23.0F, 0.0F));

		PartDefinition field_78123_h = partdefinition.addOrReplaceChild("field_78123_h", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-5.5F, 0.0F, -6.0F, 11.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-6.0F, 0.0F, 0.0F));

		PartDefinition field_78123_hChild_1 = field_78123_h.addOrReplaceChild("field_78123_hChild_1", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(0.5F, 12.0F, -5.0F, 10.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-6.0F, 0.0F, 0.0F));

		PartDefinition field_78123_hChild = field_78123_h.addOrReplaceChild("field_78123_hChild", CubeListBuilder.create().texOffs(2, 110).mirror().addBox(-5.5F, 18.0F, -8.0F, 10.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition field_78121_j = partdefinition.addOrReplaceChild("field_78121_j", CubeListBuilder.create().texOffs(24, 0).addBox(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		field_78112_f.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		field_78124_i.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		field_78116_c.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		field_78115_e.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		field_78113_g.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		field_78123_h.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		field_78121_j.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}