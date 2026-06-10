// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelForestGoblinLeggings extends EntityModel<Entity> {
	private final ModelRenderer legLeftArmour;
	private final ModelRenderer bone14;
	private final ModelRenderer bone10;
	private final ModelRenderer legLeftArmour2;
	private final ModelRenderer legRightArmour;
	private final ModelRenderer bone13;
	private final ModelRenderer bone12;
	private final ModelRenderer bone11;
	private final ModelRenderer legRightArmour2;

	public WFMModelForestGoblinLeggings() {
		texWidth = 64;
		texHeight = 64;

		legLeftArmour = new ModelRenderer(this);
		legLeftArmour.setPos(1.9F, 13.0F, 2.0F);
		setRotationAngle(legLeftArmour, -0.3054F, 0.0F, 0.0F);
		legLeftArmour.texOffs(0, 16).addBox(-2.0F, 1.0926F, -2.6014F, 4.0F, 6.0F, 4.0F, 0.5F, true);

		bone14 = new ModelRenderer(this);
		bone14.setPos(1.4622F, 2.0256F, 2.3248F);
		legLeftArmour.addChild(bone14);
		setRotationAngle(bone14, 3.1303F, 0.0421F, -1.1783F);
		bone14.texOffs(27, 0).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.texOffs(43, 0).addBox(-3.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.texOffs(43, 0).addBox(-3.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.texOffs(43, 0).addBox(2.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone14.texOffs(43, 0).addBox(2.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setPos(0.866F, 4.6876F, -3.5F);
		legLeftArmour.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, -1.7017F);
		bone10.texOffs(27, 0).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone10.texOffs(43, 0).addBox(-3.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone10.texOffs(43, 0).addBox(-3.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone10.texOffs(43, 0).addBox(2.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone10.texOffs(43, 0).addBox(2.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		legLeftArmour2 = new ModelRenderer(this);
		legLeftArmour2.setPos(0.0F, 3.1388F, -0.9021F);
		legLeftArmour.addChild(legLeftArmour2);
		setRotationAngle(legLeftArmour2, 0.4363F, 0.0F, 0.0F);
		legLeftArmour2.texOffs(1, 30).addBox(-1.4F, 3.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.5F, true);

		legRightArmour = new ModelRenderer(this);
		legRightArmour.setPos(-2.1F, 13.0F, 2.0F);
		setRotationAngle(legRightArmour, -0.3054F, 0.0F, 0.0F);
		legRightArmour.texOffs(0, 16).addBox(-2.0F, 1.0926F, -2.6014F, 4.0F, 6.0F, 4.0F, 0.5F, false);

		bone13 = new ModelRenderer(this);
		bone13.setPos(-0.9368F, 2.1723F, 2.5F);
		legRightArmour.addChild(bone13);
		setRotationAngle(bone13, 3.099F, 0.0094F, -2.2691F);
		bone13.texOffs(27, 0).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone13.texOffs(43, 0).addBox(-3.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone13.texOffs(43, 0).addBox(-3.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone13.texOffs(43, 0).addBox(2.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone13.texOffs(43, 0).addBox(2.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone12 = new ModelRenderer(this);
		bone12.setPos(-1.1983F, 5.1609F, -3.5F);
		legRightArmour.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, -1.4835F);
		bone12.texOffs(27, 0).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone12.texOffs(43, 0).addBox(-3.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone12.texOffs(43, 0).addBox(-3.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone12.texOffs(43, 0).addBox(2.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone12.texOffs(43, 0).addBox(2.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setPos(1.8775F, 4.4261F, -3.5F);
		legRightArmour.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -1.4835F);
		bone11.texOffs(27, 0).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone11.texOffs(43, 0).addBox(-3.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone11.texOffs(43, 0).addBox(-3.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone11.texOffs(43, 0).addBox(2.0F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone11.texOffs(43, 0).addBox(2.0F, 0.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		legRightArmour2 = new ModelRenderer(this);
		legRightArmour2.setPos(0.0F, 3.1388F, -0.9021F);
		legRightArmour.addChild(legRightArmour2);
		setRotationAngle(legRightArmour2, 0.4363F, 0.0F, 0.0F);
		legRightArmour2.texOffs(1, 30).addBox(-1.4F, 3.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.5F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		legLeftArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		legRightArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}