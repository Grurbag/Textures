// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Gabriel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "gabriel"), "main");
	private final ModelPart field_78114_d;
	private final ModelPart field_78112_f;
	private final ModelPart field_78124_i;
	private final ModelPart field_78116_c;
	private final ModelPart field_78115_e;
	private final ModelPart field_78113_g;
	private final ModelPart field_78123_h;
	private final ModelPart head;

	public Gabriel(ModelPart root) {
		this.field_78114_d = root.getChild("field_78114_d");
		this.field_78112_f = root.getChild("field_78112_f");
		this.field_78124_i = root.getChild("field_78124_i");
		this.field_78116_c = root.getChild("field_78116_c");
		this.field_78115_e = root.getChild("field_78115_e");
		this.field_78113_g = root.getChild("field_78113_g");
		this.field_78123_h = root.getChild("field_78123_h");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition field_78114_d = partdefinition.addOrReplaceChild("field_78114_d", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition field_78112_f = partdefinition.addOrReplaceChild("field_78112_f", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition field_78124_i = partdefinition.addOrReplaceChild("field_78124_i", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition field_78124_i2 = field_78124_i.addOrReplaceChild("field_78124_i2", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition field_78116_c = partdefinition.addOrReplaceChild("field_78116_c", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition field_78115_e = partdefinition.addOrReplaceChild("field_78115_e", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition field_78115_e2 = field_78115_e.addOrReplaceChild("field_78115_e2", CubeListBuilder.create().texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition field_78113_g = partdefinition.addOrReplaceChild("field_78113_g", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition field_78123_h = partdefinition.addOrReplaceChild("field_78123_h", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition field_78123_h2 = field_78123_h.addOrReplaceChild("field_78123_h2", CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(64, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hat = head.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(74, 34).addBox(-9.0F, -1.5F, -9.0F, 18.0F, 0.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition hat2 = head.addOrReplaceChild("hat2", CubeListBuilder.create().texOffs(96, 21).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition hat3 = hat2.addOrReplaceChild("hat3", CubeListBuilder.create().texOffs(64, 24).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		field_78114_d.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		field_78112_f.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		field_78124_i.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		field_78116_c.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		field_78115_e.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		field_78113_g.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		field_78123_h.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}