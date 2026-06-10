// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelTombKingsBody extends EntityModel<Entity> {
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer Body;
	private final ModelRenderer cape;
	private final ModelRenderer body_r1;
	private final ModelRenderer front;
	private final ModelRenderer cube_r1;
	private final ModelRenderer back;
	private final ModelRenderer cube_r2;

	public WFMModelTombKingsBody() {
		texWidth = 64;
		texHeight = 64;

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		LeftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		LeftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		RightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		RightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		Body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);

		cape = new ModelRenderer(this);
		cape.setPos(0.0F, -1.0F, -3.0F);
		Body.addChild(cape);
		setRotationAngle(cape, 1.3526F, 0.0F, 0.0F);
		

		body_r1 = new ModelRenderer(this);
		body_r1.setPos(0.0F, 0.0F, 0.0F);
		cape.addChild(body_r1);
		setRotationAngle(body_r1, 0.2182F, 0.0F, 0.0F);
		body_r1.texOffs(0, 46).addBox(-8.5F, 0.0F, 0.0F, 17.0F, 6.0F, 0.0F, 0.0F, false);

		front = new ModelRenderer(this);
		front.setPos(0.0F, 0.0F, 0.0F);
		cape.addChild(front);
		front.texOffs(-10, 54).addBox(-8.5F, 0.0F, -10.0F, 17.0F, 0.0F, 10.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 4.0F, 5.0F);
		front.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.4835F, 0.0F, 0.0F);
		cube_r1.texOffs(56, 38).addBox(-1.5F, -15.0F, 2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(58, 41).addBox(-3.5F, -14.0F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r1.texOffs(58, 41).addBox(1.5F, -14.0F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(58, 45).addBox(-5.5F, -13.0F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r1.texOffs(58, 45).addBox(3.5F, -13.0F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(60, 49).addBox(5.5F, -12.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r1.texOffs(60, 49).addBox(-6.5F, -12.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(60, 53).addBox(-7.5F, -11.0F, 2.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r1.texOffs(60, 53).addBox(6.5F, -11.0F, 2.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(60, 60).addBox(7.5F, -9.0F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		cube_r1.texOffs(60, 60).addBox(-8.5F, -9.0F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		back = new ModelRenderer(this);
		back.setPos(0.0F, 5.8578F, 1.2986F);
		cape.addChild(back);
		setRotationAngle(back, -0.4363F, 0.0F, -3.1416F);
		back.texOffs(-10, 54).addBox(-8.5F, 0.0F, -10.0F, 17.0F, 0.0F, 10.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 4.0F, 5.0F);
		back.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.4835F, 0.0F, 0.0F);
		cube_r2.texOffs(56, 38).addBox(-1.5F, -15.0F, 2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.texOffs(58, 41).addBox(-3.5F, -14.0F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r2.texOffs(58, 41).addBox(1.5F, -14.0F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.texOffs(58, 45).addBox(-5.5F, -13.0F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r2.texOffs(58, 45).addBox(3.5F, -13.0F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.texOffs(60, 49).addBox(5.5F, -12.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r2.texOffs(60, 49).addBox(-6.5F, -12.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.texOffs(60, 53).addBox(-7.5F, -11.0F, 2.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r2.texOffs(60, 53).addBox(6.5F, -11.0F, 2.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r2.texOffs(60, 60).addBox(7.5F, -9.0F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		cube_r2.texOffs(60, 60).addBox(-8.5F, -9.0F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}