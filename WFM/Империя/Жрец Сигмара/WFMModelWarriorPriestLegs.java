// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelWarriorPriestLegs extends EntityModel<Entity> {
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg_r3;
	private final ModelRenderer RightLeg_r4;
	private final ModelRenderer book;

	public WFMModelWarriorPriestLegs() {
		texWidth = 64;
		texHeight = 64;

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		RightLeg.texOffs(0, 16).addBox(-2.5F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.55F, true);
		RightLeg.texOffs(0, 29).addBox(-3.3479F, 0.0326F, -3.2F, 3.0F, 8.0F, 0.0F, 0.0F, false);

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(-1.0F, -1.0F, 0.0F);
		RightLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.0F, 0.0F, 0.0436F);
		RightLeg_r1.texOffs(21, 11).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, true);
		RightLeg_r1.texOffs(21, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.81F, true);

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(0.0F, -1.0F, 0.0F);
		RightLeg.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0F, 0.0F, 0.0436F);
		RightLeg_r2.texOffs(0, 0).addBox(-2.5F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		LeftLeg.texOffs(0, 16).addBox(-1.5F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.55F, false);

		RightLeg_r3 = new ModelRenderer(this);
		RightLeg_r3.setPos(1.0F, -1.0F, 0.0F);
		LeftLeg.addChild(RightLeg_r3);
		setRotationAngle(RightLeg_r3, 0.0F, 0.0F, -0.0436F);
		RightLeg_r3.texOffs(21, 11).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		RightLeg_r3.texOffs(21, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.81F, false);

		RightLeg_r4 = new ModelRenderer(this);
		RightLeg_r4.setPos(0.0F, -1.0F, 0.0F);
		LeftLeg.addChild(RightLeg_r4);
		setRotationAngle(RightLeg_r4, 0.0F, 0.0F, -0.0436F);
		RightLeg_r4.texOffs(0, 0).addBox(-1.5F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);

		book = new ModelRenderer(this);
		book.setPos(3.0F, 1.0F, 0.0F);
		LeftLeg.addChild(book);
		setRotationAngle(book, 0.0F, 0.0F, -0.1745F);
		book.texOffs(0, 49).addBox(-1.0F, -1.0F, -4.0F, 4.0F, 7.0F, 8.0F, -1.0F, false);
		book.texOffs(40, 0).addBox(-1.0F, -1.0F, -4.0F, 4.0F, 7.0F, 8.0F, -1.1F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}