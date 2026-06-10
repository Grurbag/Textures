// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelChaosWarriorNurgleHelmet extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer hornRight;
	private final ModelRenderer hornRight2;
	private final ModelRenderer hornRight3;
	private final ModelRenderer hornRight4;
	private final ModelRenderer hornRight5;

	public WFMModelChaosWarriorNurgleHelmet() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(0, 16).addBox(-4.5F, -9.0F, -5.1F, 9.0F, 10.0F, 0.0F, 0.0F, false);
		Head.texOffs(0, 55).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		Head.texOffs(0, 47).addBox(-3.0F, -11.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);

		hornRight = new ModelRenderer(this);
		hornRight.setPos(0.0F, -8.0F, -4.0F);
		Head.addChild(hornRight);
		setRotationAngle(hornRight, -0.7854F, 1.2217F, -1.5708F);
		hornRight.texOffs(50, 56).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);

		hornRight2 = new ModelRenderer(this);
		hornRight2.setPos(3.0F, 0.0F, 0.0F);
		hornRight.addChild(hornRight2);
		setRotationAngle(hornRight2, 0.8165F, -0.2443F, -0.2519F);
		hornRight2.texOffs(50, 49).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, -0.15F, false);

		hornRight3 = new ModelRenderer(this);
		hornRight3.setPos(1.2817F, 0.0F, 0.5977F);
		hornRight2.addChild(hornRight3);
		setRotationAngle(hornRight3, 0.0F, -0.6109F, 0.0F);
		hornRight3.texOffs(50, 43).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 2.0F, 3.0F, -0.15F, false);

		hornRight4 = new ModelRenderer(this);
		hornRight4.setPos(3.5976F, 0.0F, 0.2396F);
		hornRight3.addChild(hornRight4);
		setRotationAngle(hornRight4, 0.0F, -0.5672F, 0.0F);
		hornRight4.texOffs(52, 39).addBox(-1.9962F, -0.5F, -0.0872F, 4.0F, 1.0F, 2.0F, -0.15F, false);

		hornRight5 = new ModelRenderer(this);
		hornRight5.setPos(2.9886F, -1.0F, 0.2615F);
		hornRight4.addChild(hornRight5);
		setRotationAngle(hornRight5, 0.0F, 0.0F, 0.0F);
		hornRight5.texOffs(56, 37).addBox(-1.9962F, 1.0F, -0.0872F, 3.0F, 0.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}