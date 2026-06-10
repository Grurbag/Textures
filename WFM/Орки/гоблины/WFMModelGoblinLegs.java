// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelGoblinLegs extends EntityModel<Entity> {
	private final ModelRenderer legLeftArmour;
	private final ModelRenderer legLeftArmour2;
	private final ModelRenderer legLeftArmour3;
	private final ModelRenderer legLeftArmour4;
	private final ModelRenderer legRightArmour;
	private final ModelRenderer legRightArmour2;
	private final ModelRenderer legRightArmour3;
	private final ModelRenderer legRightArmour4;

	public WFMModelGoblinLegs() {
		texWidth = 64;
		texHeight = 64;

		legLeftArmour = new ModelRenderer(this);
		legLeftArmour.setPos(1.9F, 13.0F, 2.0F);
		setRotationAngle(legLeftArmour, -0.3054F, 0.0F, 0.0F);
		legLeftArmour.texOffs(0, 16).addBox(-2.0F, 1.0926F, -2.6014F, 4.0F, 6.0F, 4.0F, 0.5F, true);

		legLeftArmour2 = new ModelRenderer(this);
		legLeftArmour2.setPos(0.0F, 3.1388F, -0.9021F);
		legLeftArmour.addChild(legLeftArmour2);
		setRotationAngle(legLeftArmour2, 0.4363F, 0.0F, 0.0F);
		legLeftArmour2.texOffs(1, 30).addBox(-1.4F, 3.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.5F, true);

		legLeftArmour3 = new ModelRenderer(this);
		legLeftArmour3.setPos(0.0F, -1.9074F, -0.6014F);
		legLeftArmour.addChild(legLeftArmour3);
		legLeftArmour3.texOffs(16, 16).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.3F, true);

		legLeftArmour4 = new ModelRenderer(this);
		legLeftArmour4.setPos(0.0F, 5.0463F, -0.3007F);
		legLeftArmour3.addChild(legLeftArmour4);
		setRotationAngle(legLeftArmour4, 0.4363F, 0.0F, 0.0F);
		legLeftArmour4.texOffs(17, 30).addBox(-1.4F, 3.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.3F, true);

		legRightArmour = new ModelRenderer(this);
		legRightArmour.setPos(-2.1F, 13.0F, 2.0F);
		setRotationAngle(legRightArmour, -0.3054F, 0.0F, 0.0F);
		legRightArmour.texOffs(0, 16).addBox(-2.0F, 1.0926F, -2.6014F, 4.0F, 6.0F, 4.0F, 0.5F, false);

		legRightArmour2 = new ModelRenderer(this);
		legRightArmour2.setPos(0.0F, 3.1388F, -0.9021F);
		legRightArmour.addChild(legRightArmour2);
		setRotationAngle(legRightArmour2, 0.4363F, 0.0F, 0.0F);
		legRightArmour2.texOffs(1, 30).addBox(-1.4F, 3.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.5F, false);

		legRightArmour3 = new ModelRenderer(this);
		legRightArmour3.setPos(0.0F, -1.9074F, -0.6014F);
		legRightArmour.addChild(legRightArmour3);
		legRightArmour3.texOffs(16, 16).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.3F, false);

		legRightArmour4 = new ModelRenderer(this);
		legRightArmour4.setPos(0.0F, 5.0463F, -0.3007F);
		legRightArmour3.addChild(legRightArmour4);
		setRotationAngle(legRightArmour4, 0.4363F, 0.0F, 0.0F);
		legRightArmour4.texOffs(17, 30).addBox(-1.4F, 3.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.3F, false);
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